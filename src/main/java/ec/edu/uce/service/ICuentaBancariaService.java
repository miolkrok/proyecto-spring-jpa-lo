package ec.edu.uce.service;

import java.math.BigDecimal;

import ec.edu.uce.modelo.jpa.CuentaBancaria;

public interface ICuentaBancariaService {
	
	void insertarCuentaBancaria(CuentaBancaria cuentaBancaria);
	void actualizarCuentaBancaria(CuentaBancaria cuentaBancaria);
	void actualizar2CuentaBancaria(CuentaBancaria cuentaBancaria);
	CuentaBancaria BuscarPorNumeroCuentaBanc(String numero);
	void realizarTransferencia(String cuentaOrigen, String cuentaDestino,BigDecimal valorTransferir);
	void propagacionMandatory();
	void realizarTransferenciaExpress(String cuentaOrigen, String cuentaDestino, BigDecimal valorTransferir);
	void realizarTransferenciaExpressInicial(String cuentaOrigen, String cuentaDestino, BigDecimal valorTransferir);
	void realizarTransferenciaExpressInicialNoT(String cuentaOrigen, String cuentaDestino, BigDecimal valorTransferir);
	void enviarMail();
	void enviarMailNoT();

}
