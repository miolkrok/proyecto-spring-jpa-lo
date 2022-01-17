package ec.edu.uce.service;

import ec.edu.uce.modelo.Empleados;

public interface IEmpleadosService {
	void insertarEmpleadosNuevo(Empleados empleados);
	void actualizarEmpleadosNuevo(Empleados empleados);
	void borrarEmpleadosPorId(Integer id);
	Empleados buscarEmpleadosPorId(Integer id);
}
