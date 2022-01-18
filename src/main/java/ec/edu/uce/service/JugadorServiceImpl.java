package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Jugador;
import ec.edu.uce.repository.jpa.IJugadorRepo;
@Service
public class JugadorServiceImpl implements IJugadorService{

	@Autowired
	private IJugadorRepo jugadorRepo;
	
	@Override
	public void guardar(Jugador jugador) {
		// TODO Auto-generated method stub
		this.jugadorRepo.insertarJugador(jugador);
	}

	@Override
	public void actualizar(Jugador jugador) {
		// TODO Auto-generated method stub
		this.jugadorRepo.actualizarJugador(jugador);
	}

}
