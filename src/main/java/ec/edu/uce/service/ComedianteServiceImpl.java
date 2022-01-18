package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Comediante;
import ec.edu.uce.repository.jpa.IComedianteRepo;
@Service
public class ComedianteServiceImpl implements IComedianteService{

	@Autowired
	private IComedianteRepo comedianteRepo;
	
	@Override
	public void guardar(Comediante comediante) {
		// TODO Auto-generated method stub
		this.comedianteRepo.insertarComediante(comediante);
	}

	@Override
	public void actualizar(Comediante comediante) {
		// TODO Auto-generated method stub
		this.comedianteRepo.actualizarComediante(comediante);
	}

}
