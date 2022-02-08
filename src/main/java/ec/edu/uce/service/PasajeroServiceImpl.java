package ec.edu.uce.service;

import java.util.List;

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
	@Override
	public List<Pasajero> buscarPorCedulaJOIN(String cedula) {
		// TODO Auto-generated method stub
		return this.pasajeroRepo.buscarPorCedulaJOIN(cedula);
	}
	@Override
	public List<Pasajero> buscarPorCedulaJOINLEFT(String cedula) {
		// TODO Auto-generated method stub
		return this.pasajeroRepo.buscarPorCedulaJOINLEFT(cedula);
	}
	@Override
	public List<Pasajero> buscarPorCedulaJOINRIGHT(String cedula) {
		// TODO Auto-generated method stub
		return this.pasajeroRepo.buscarPorCedulaJOINRIGHT(cedula);
	}
	@Override
	public List<Pasajero> buscarPorCedulaJOINWHERE(String cedula) {
		// TODO Auto-generated method stub
		return this.pasajeroRepo.buscarPorCedulaJOINWHERE(cedula);
	}

}
