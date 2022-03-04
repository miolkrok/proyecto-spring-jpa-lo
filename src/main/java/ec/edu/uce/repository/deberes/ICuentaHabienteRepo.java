package ec.edu.uce.repository.deberes;

import ec.edu.uce.modelo.deberes.CuentaHabiente;

public interface ICuentaHabienteRepo {

	void insertarCuentaHabiente(CuentaHabiente cuentaHabiente);
	void actualizarCuentaHabiente(CuentaHabiente cuentaHabiente);
	CuentaHabiente buscarCuentaHabiente(Integer id);
	void borrarCuentaHabiente(Integer id);
	CuentaHabiente buscarCuentaHabienteCedula(String cedula);
}
