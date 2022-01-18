package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.Jugador;

public interface IJugadorService {
	void guardar(Jugador jugador);
	void actualizar(Jugador jugador);
}
