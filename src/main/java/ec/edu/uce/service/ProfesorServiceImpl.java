package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Profesor;
import ec.edu.uce.repository.IProfesorRepo;
@Service
public class ProfesorServiceImpl implements IProfesorService{

	@Autowired
	private IProfesorRepo profesorRepo;
	@Override
	public void insertarProfesorNuevo(Profesor profesor) {
		// TODO Auto-generated method stub
		this.profesorRepo.insertarProfesor(profesor);
	}
	@Override
	public void actualizarProfesorNuevo(Profesor profesor) {
		// TODO Auto-generated method stub
		this.profesorRepo.actualizarProfesor(profesor);
	}
	@Override
	public void borrarProfesorPorId(Integer id) {
		// TODO Auto-generated method stub
		this.profesorRepo.borrarProfesor(id);
	}
	@Override
	public Profesor busarProfesorPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.profesorRepo.buscarProfesor(id);
	}



}
