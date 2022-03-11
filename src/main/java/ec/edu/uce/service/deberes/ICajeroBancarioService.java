package ec.edu.uce.service.deberes;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import ec.edu.uce.modelo.deberes.CuentaBancariaD;

public interface ICajeroBancarioService {
	
	List<CuentaBancariaD> consultarCuenta(String cedula);
	void retirarDinero(String numeroCuenta, BigDecimal valorRetirar);
	BigDecimal consultarSaldoCuentaBancaria(String numeroCuenta);
	void reporteCuentaBancariaDVIP(BigDecimal saldo);
	void reporteHistoricoRetiros(LocalDateTime fechaRetiro, BigDecimal montoRetiro);
	
	
	

}
