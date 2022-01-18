package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Cantante;
import ec.edu.uce.repository.jpa.ICantanteRepo;
@Service
public class CantanteServiceImpl implements ICantanteService{
	
	@Autowired
	private ICantanteRepo cantanteRepo;

	@Override
	public void guardar(Cantante cantante) {
		// TODO Auto-generated method stub
		this.cantanteRepo.insertarCantante(cantante);
	}

	@Override
	public void actualizar(Cantante cantante) {
		// TODO Auto-generated method stub
		this.cantanteRepo.actualizarCantante(cantante);
	}

}
