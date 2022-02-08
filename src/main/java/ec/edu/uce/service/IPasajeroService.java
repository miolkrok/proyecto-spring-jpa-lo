package ec.edu.uce.service;

import java.util.List;

import ec.edu.uce.modelo.jpa.Pasajero;

public interface IPasajeroService {
	
	void guardarPasajero(Pasajero pasajero);
	List<Pasajero> buscarPorCedulaJOIN(String cedula);
	List<Pasajero> buscarPorCedulaJOINLEFT(String cedula);
	List<Pasajero> buscarPorCedulaJOINRIGHT(String cedula);
	List<Pasajero> buscarPorCedulaJOINWHERE(String cedula);

}
