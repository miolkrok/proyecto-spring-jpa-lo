package ec.edu.uce.service;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionSynchronizationManager;



@Service
public class CuentaBancariaFachadaServiceImpl {
	
	private static final Logger LOG =  LoggerFactory.getLogger(CuentaBancariaFachadaServiceImpl.class);
	
	@Autowired
	private ICuentaBancariaService cuentaBancService;
	
	public void realizarTransferenciaExpressInicialNoT(String cuentaOrigen, String cuentaDestino, BigDecimal valorTransferir) {
		LOG.info("Prueba 1: " +TransactionSynchronizationManager.isActualTransactionActive());
		this.cuentaBancService.realizarTransferenciaExpress(cuentaOrigen, cuentaDestino, valorTransferir);
	}

}
