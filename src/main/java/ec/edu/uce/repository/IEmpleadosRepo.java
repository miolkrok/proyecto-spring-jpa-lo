package ec.edu.uce.repository;

import ec.edu.uce.modelo.Empleados;


public interface IEmpleadosRepo {
	void insertarEmpleados(Empleados empleados);
	Empleados buscarEmpleados(Integer id);
	void actualizarEmpleados(Empleados empleados);
	void borrarEmpleados(Integer id);
}
