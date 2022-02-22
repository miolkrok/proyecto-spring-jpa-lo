package ec.edu.uce.service;

import java.math.BigDecimal;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.CuentaBancaria;
import ec.edu.uce.repository.jpa.ICuentaBancariaRepo;

@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService{
	
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
		
		
		this.cuentaBancariaRepo.actualizarCuentaBancaria(cuentaOri);
		this.cuentaBancariaRepo.actualizarCuentaBancaria(cuentaDesti);
	}

}
