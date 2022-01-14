package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Carreras;
import ec.edu.uce.repository.ICarrerasRepo;
@Service
public class CarrerasServiceImpl implements ICarrerasService{

	@Autowired
	private ICarrerasRepo carreraRepo;
	@Override
	public void insertarCarrerasNuevo(Carreras carreras) {
		// TODO Auto-generated method stub
		this.carreraRepo.insertarCarreras(carreras);
	}

}
