package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
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
		return this.entityManager.find(Jugador.class, id);
	}

	@Override
	public void borrarJugadorPorId(Integer id) {
		// TODO Auto-generated method stub
		Jugador jugadorABorrar = this.buscarJugadorPorId(id);
		this.entityManager.remove(jugadorABorrar);
	}

	@Override
	public Jugador buscarJugadorPorNombre(String nombre) {
		// TODO Auto-generated method stub
		Query miQuery = this.entityManager.createQuery("select g from Jugador g where g.nombre=: valor");
		miQuery.setParameter("valor", nombre);
		Jugador miJugador = (Jugador) miQuery.getSingleResult();
		//Guardia miGuardia = (Guardia) miQuery.getResultList();
		return miJugador;
	}

}
