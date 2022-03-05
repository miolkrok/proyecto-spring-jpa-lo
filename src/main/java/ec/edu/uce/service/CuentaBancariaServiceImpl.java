package ec.edu.uce.service;

import java.math.BigDecimal;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.CuentaBancaria;
import ec.edu.uce.repository.jpa.GuardiaRepoImpl;
import ec.edu.uce.repository.jpa.ICuentaBancariaRepo;

/**
 * @author Luis
 *
 */
/**
 * @author Luis
 *
 */
@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService{
	
	
	private static final Logger LOG =  LoggerFactory.getLogger(CuentaBancariaServiceImpl.class);

	@Autowired
	private ICuentaBancariaRepo cuentaBancariaRepo;

	@Override
	public void insertarCuentaBancaria(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.cuentaBancariaRepo.insertarCuentaBancaria(cuentaBancaria);
	}

	@Override
	public void actualizarCuentaBancaria(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.cuentaBancariaRepo.actualizarCuentaBancaria(cuentaBancaria);
		
	}

	@Override
	public CuentaBancaria BuscarPorNumeroCuentaBanc(String numero) {
		// TODO Auto-generated method stub
		return this.cuentaBancariaRepo.BuscarPorNumeroCuentaBanc(numero);
	}

	@Override
	@Transactional
	public void realizarTransferencia(String cuentaOrigen, String cuentaDestino, BigDecimal valorTransferir) {
		// TODO Auto-generated method stub
		CuentaBancaria cuentaOri = this.cuentaBancariaRepo.BuscarPorNumeroCuentaBanc(cuentaOrigen);
		CuentaBancaria cuentaDesti = this.cuentaBancariaRepo.BuscarPorNumeroCuentaBanc(cuentaDestino);
		
		BigDecimal nuevoSaldoOrigen = cuentaOri.getSaldo().subtract(valorTransferir);
		cuentaOri.setSaldo(nuevoSaldoOrigen);
		
//		cuentaOri.setSaldo(cuentaOri.getSaldo().subtract(valorTransferir));
//		cuentaDesti.setSaldo(valorTransferir);
		
		BigDecimal nuevoSaldoDestino = cuentaDesti.getSaldo().add(valorTransferir);
		cuentaDesti.setSaldo(nuevoSaldoDestino);
//		cuentaDesti.setTipo(null);
//		try {
//		LOG.info("AA1");
		this.cuentaBancariaRepo.actualizarCuentaBancaria(cuentaOri);
//		}catch(ArrayIndexOutOfBoundsException e) {
//		LOG.error("ERROR");
//		}
//		LOG.info("DA1");
//		LOG.info("AA2");
//		try {
		this.cuentaBancariaRepo.actualizarCuentaBancaria(cuentaDesti);

//		}catch(ArrayIndexOutOfBoundsException e) {
//			LOG.error("ERROR");
//		}
//		LOG.info("DA2");
	}
	
	@Override
	@Transactional
	public void realizarTransferenciaExpressInicial(String cuentaOrigen, String cuentaDestino, BigDecimal valorTransferir) {
		this.realizarTransferenciaExpress(cuentaOrigen, cuentaDestino, valorTransferir);
	}
	
	
	/**
	 * @param cuentaOrigen
	 * @param cuentaDestino
	 * @param valorTransferir
	 */
	@Override
//	@Transactional//segundo escenario
	public void realizarTransferenciaExpressInicialNoT(String cuentaOrigen, String cuentaDestino, BigDecimal valorTransferir) {
		this.realizarTransferenciaExpress(cuentaOrigen, cuentaDestino, valorTransferir);
	}
		
	@Override
//	@Transactional(value = TxType.SUPPORTS)
	@Transactional(value = TxType.REQUIRES_NEW)
	public void realizarTransferenciaExpress(String cuentaOrigen, String cuentaDestino, BigDecimal valorTransferir) {
		// TODO Auto-generated method stub
		LOG.info("Ejecucion SUPPORTS antes");
		CuentaBancaria cuentaOri = this.cuentaBancariaRepo.BuscarPorNumeroCuentaBanc(cuentaOrigen);
		CuentaBancaria cuentaDesti = this.cuentaBancariaRepo.BuscarPorNumeroCuentaBanc(cuentaDestino);
		
		BigDecimal nuevoSaldoOrigen = cuentaOri.getSaldo().subtract(valorTransferir);
		cuentaOri.setSaldo(nuevoSaldoOrigen);
				
		BigDecimal nuevoSaldoDestino = cuentaDesti.getSaldo().add(valorTransferir);
		cuentaDesti.setSaldo(nuevoSaldoDestino);
		this.cuentaBancariaRepo.actualizarCuentaBancaria(cuentaOri);
		this.cuentaBancariaRepo.actualizarCuentaBancaria(cuentaDesti);
	}

	@Override
	public void actualizar2CuentaBancaria(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.cuentaBancariaRepo.actualizarCuentaBancaria2(cuentaBancaria);
	}

	@Override
	@Transactional(value = TxType.MANDATORY)
	public void propagacionMandatory() {
		// TODO Auto-generated method stub
		LOG.info("EJECUCION MANDATORIA");
	}

	@Override
	@Transactional
	public void enviarMail() {
		// TODO Auto-generated method stub
		this.cuentaBancariaRepo.enviarMail("COrreo clases");
	}

	@Override
	public void enviarMailNoT() {
		// TODO Auto-generated method stub
		this.cuentaBancariaRepo.enviarMail("COrreo clases NoT");
	}

}
