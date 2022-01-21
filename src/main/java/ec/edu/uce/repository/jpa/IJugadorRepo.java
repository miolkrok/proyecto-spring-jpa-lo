package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.Jugador;

public interface IJugadorRepo {

	void insertarJugador(Jugador jugador);
	void actualizarJugador(Jugador jugador);
	Jugador buscarJugadorPorId(Integer id);
	void borrarJugadorPorId(Integer id);
	Jugador buscarJugadorPorNombre(String apellido);
}
