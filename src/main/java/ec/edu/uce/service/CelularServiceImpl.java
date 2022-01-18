package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Celular;
import ec.edu.uce.repository.jpa.ICelularRepo;
@Service
public class CelularServiceImpl implements ICelularService{

	@Autowired
	private ICelularRepo celularRepo;
	
	@Override
	public void guardar(Celular celular) {
		// TODO Auto-generated method stub
		this.celularRepo.insertarCelular(celular);
	}

	@Override
	public void actualizar(Celular celular) {
		// TODO Auto-generated method stub
		this.celularRepo.actualizarCelular(celular);
	}

}
