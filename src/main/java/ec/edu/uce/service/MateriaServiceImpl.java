package ec.edu.uce.service;

import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Materia;
import ec.edu.uce.repository.IMateriaRepo;
@Service
public class MateriaServiceImpl implements IMateriaService{

	
	private IMateriaRepo materiaRepo;
	@Override
	public void insertarMateriaNuevo(Materia materia) {
		// TODO Auto-generated method stub
		this.materiaRepo.insertarMateria(materia);
	}



}
