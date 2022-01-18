package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Jugador;

@Repository
@Transactional
public class JugadorRepoImpl implements IJugadorRepo{

	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarJugador(Jugador jugador) {
		// TODO Auto-generated method stub
		this.entityManager.persist(jugador);
	}

	@Override
	public void actualizarJugador(Jugador jugador) {
		// TODO Auto-generated method stub
		this.entityManager.merge(jugador);
	}

	@Override
	public Jugador buscarJugadorPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrarJugadorPorId(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
