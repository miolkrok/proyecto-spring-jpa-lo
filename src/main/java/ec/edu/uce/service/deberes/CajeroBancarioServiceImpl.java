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
import ec.edu.uce.modelo.deberes.HistoricoRetiros;
import ec.edu.uce.repository.deberes.CuentaBancariaDRepoImpl;

@Service
public class CajeroBancarioServiceImpl implements ICajeroBancarioService{
	
	private static final Logger LOG =  LoggerFactory.getLogger(CuentaBancariaDRepoImpl.class);

	
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

}
