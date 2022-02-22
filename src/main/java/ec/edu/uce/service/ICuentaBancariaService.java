package ec.edu.uce.service;

import java.math.BigDecimal;

import ec.edu.uce.modelo.jpa.CuentaBancaria;

public interface ICuentaBancariaService {
	
	void insertarCuentaBancaria(CuentaBancaria cuentaBancaria);
	void actualizarCuentaBancaria(CuentaBancaria cuentaBancaria);
	CuentaBancaria BuscarPorNumeroCuentaBanc(String numero);
	void realizarTransferencia(String cuentaOrigen, String cuentaDestino,BigDecimal valorTransferir);

}
