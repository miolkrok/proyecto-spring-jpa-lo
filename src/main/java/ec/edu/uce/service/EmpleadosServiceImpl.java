package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Empleados;
import ec.edu.uce.repository.IEmpleadosRepo;
@Service
public class EmpleadosServiceImpl implements IEmpleadosService{

	@Autowired
	private IEmpleadosRepo empleadoRepo;
	@Override
	public void insertarEmpleadosNuevo(Empleados empleados) {
		// TODO Auto-generated method stub
		this.empleadoRepo.insertarEmpleados(empleados);
	}
	@Override
	public void actualizarEmpleadosNuevo(Empleados empleados) {
		// TODO Auto-generated method stub
		this.empleadoRepo.actualizarEmpleados(empleados);
	}
	@Override
	public void borrarEmpleadosPorId(Integer id) {
		// TODO Auto-generated method stub
		this.empleadoRepo.borrarEmpleados(id);
	}
	@Override
	public Empleados buscarEmpleadosPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.empleadoRepo.buscarEmpleados(id);
	}



}
