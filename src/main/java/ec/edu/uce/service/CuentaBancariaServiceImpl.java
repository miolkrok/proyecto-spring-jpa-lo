package ec.edu.uce.service;

import java.math.BigDecimal;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.CuentaBancaria;
import ec.edu.uce.repository.jpa.GuardiaRepoImpl;
import ec.edu.uce.repository.jpa.ICuentaBancariaRepo;

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
		try {
		LOG.info("AA1");
		this.cuentaBancariaRepo.actualizarCuentaBancaria(cuentaOri);
		}catch(ArrayIndexOutOfBoundsException e) {
		LOG.error("ERROR");
		}
		LOG.info("DA1");
		LOG.info("AA2");
//		try {
			this.cuentaBancariaRepo.actualizarCuentaBancaria2(cuentaDesti);

//		}catch(ArrayIndexOutOfBoundsException e) {
//			LOG.error("ERROR");
//		}
		LOG.info("DA2");
	}

	@Override
	public void actualizar2CuentaBancaria(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.cuentaBancariaRepo.actualizarCuentaBancaria2(cuentaBancaria);
	}

}
