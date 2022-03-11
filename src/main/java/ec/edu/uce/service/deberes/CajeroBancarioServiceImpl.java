package ec.edu.uce.service.deberes;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.deberes.CuentaBancariaD;
import ec.edu.uce.modelo.deberes.CuentaHabiente;
import ec.edu.uce.modelo.deberes.CuentaHabienteVIPTO;
import ec.edu.uce.modelo.deberes.HistoricoRetiros;


@Service
public class CajeroBancarioServiceImpl implements ICajeroBancarioService{
	
	private static final Logger LOG =  LoggerFactory.getLogger(CajeroBancarioServiceImpl.class);

	
	@Autowired
	private ICuentaBancariaDService cuentaBancService;
	@Autowired
	private ICuentaHabienteService cuentaHabService;
	@Autowired
	private IHistoricoRetirosService histRetiroService;
	

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public List<CuentaBancariaD> consultarCuenta(String cedula) {
		// TODO Auto-generated method stub
		return this.cuentaBancService.buscarCuentaBancariaDHab(this.cuentaHabService.buscarCuentaHabienteCedula(cedula));
	}

	@Override
	@Transactional
	public void retirarDinero(String numeroCuenta, BigDecimal valorRetirar) {
		// TODO Auto-generated method stub
		
//		try {
			CuentaBancariaD cuentaBanc = this.cuentaBancService.buscarCuentaBancariaDNum(numeroCuenta);
			CuentaHabiente cuentaHab = this.cuentaHabService.buscarCuentaHabiente(cuentaBanc.getCuentaHabienteBanc().getId());
			
			cuentaBanc.setSaldo(cuentaBanc.getSaldo().subtract(valorRetirar));
			this.cuentaBancService.actualizarCuentaBancariaD(cuentaBanc);
			
			HistoricoRetiros histRetiros = new HistoricoRetiros();
			histRetiros.setCuentaBancaria(cuentaBanc);
			histRetiros.setCuentaHabiente(cuentaHab);
			histRetiros.setFechaRetiro(LocalDateTime.now());
			histRetiros.setMontoRetiro(valorRetirar);
			this.histRetiroService.insertarHistoricoRetiros(histRetiros);
			LOG.info("El valor de retiro es: "+valorRetirar+ " dolares de la cuenta: " +numeroCuenta);
			
			
//		}catch (ArrayIndexOutOfBoundsException e) {
//			LOG.info("rollback");
//		}
		
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public BigDecimal consultarSaldoCuentaBancaria(String numeroCuenta) {
		// TODO Auto-generated method stub
		return this.cuentaBancService.buscarCuentaBancariaDNum(numeroCuenta).getSaldo();
	}

	@Override
	public void reporteCuentaBancariaDVIP(BigDecimal saldo) {
		// TODO Auto-generated method stub
		List<CuentaBancariaD> cvip = this.cuentaBancService.buscarCuentaBancariaDVIP();
		cvip.stream().filter(v->v.getSaldo().compareTo(saldo)==0).map(v->{
			CuentaHabienteVIPTO vip = new CuentaHabienteVIPTO();
			CuentaHabiente cha = v.getCuentaHabienteBanc();
			vip.setCedula(cha.getCedula());
			vip.setNombre(cha.getNombre());
			vip.setApellido(cha.getApellido());
			vip.setNumeroCuenta(v.getNumeroCuenta());
			vip.setTipo(v.getTipo());
			vip.setSaldo(v.getSaldo());
			return vip;
		}).forEach(v -> LOG.info(v.toString()));
	}

	@Override
	public void reporteHistoricoRetiros(LocalDateTime fechaRetiro, BigDecimal montoRetiro) {
		// TODO Auto-generated method stub
		List<HistoricoRetiros> ret = this.histRetiroService.buscarReporteHistoricoRetiros();
		ret.stream().filter(r->r.getFechaRetiro().isAfter(fechaRetiro) && r.getMontoRetiro()
				.compareTo(montoRetiro) <=0).forEach(r -> LOG.info( +r.getId()
				+ " - " +r.getCuentaHabiente().getCedula() +" - "+ r.getCuentaHabiente().getNombre()
				+" - "+ r.getCuentaHabiente().getApellido() +" - " + r.getMontoRetiro() 
				+ " - " + r.getFechaRetiro()));
	}

}
