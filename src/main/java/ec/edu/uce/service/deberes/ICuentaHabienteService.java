package ec.edu.uce.service.deberes;

import ec.edu.uce.modelo.deberes.CuentaHabiente;

public interface ICuentaHabienteService {
	
	void insertarCuentaHabiente(CuentaHabiente cuentaHabiente);
	void actualizarCuentaHabiente(CuentaHabiente cuentaHabiente);
	CuentaHabiente buscarCuentaHabiente(Integer id);
	void borrarCuentaHabiente(Integer id);
	CuentaHabiente buscarCuentaHabienteCedula(String cedula);

}
