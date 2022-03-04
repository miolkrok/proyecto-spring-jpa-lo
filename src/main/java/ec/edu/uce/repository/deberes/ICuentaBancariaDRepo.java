package ec.edu.uce.repository.deberes;

import java.util.List;

import ec.edu.uce.modelo.deberes.CuentaBancariaD;
import ec.edu.uce.modelo.deberes.CuentaHabiente;

public interface ICuentaBancariaDRepo {
	void insertarCuentaBancariaD(CuentaBancariaD cuentaBancaria);
	void actualizarCuentaBancariaD(CuentaBancariaD cuentaBancaria);
	CuentaBancariaD buscarCuentaBancariaD(Integer id);
	void borrarCuentaBancariaD(Integer id);
	List<CuentaBancariaD> buscarCuentaBancariaDHab(CuentaHabiente cuentaHabiente);
	CuentaBancariaD buscarCuentaBancariaDNum(String numeroCuenta);

}
