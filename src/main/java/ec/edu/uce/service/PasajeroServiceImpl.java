package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Pasajero;
import ec.edu.uce.repository.jpa.IPasajeroRepo;

@Service
public class PasajeroServiceImpl implements IPasajeroService {

	@Autowired
	private IPasajeroRepo pasajeroRepo;
	@Override
	public void guardarPasajero(Pasajero pasajero) {
		// TODO Auto-generated method stub
		this.pasajeroRepo.insertarPasajero(pasajero);
	}

}
