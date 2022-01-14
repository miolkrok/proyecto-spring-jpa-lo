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



}
