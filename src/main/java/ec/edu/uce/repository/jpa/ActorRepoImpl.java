package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Actor;

@Repository
@Transactional
public class ActorRepoImpl implements IActorRepo {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarActor(Actor actor) {
		// TODO Auto-generated method stub
		this.entityManager.persist(actor);
	}

	@Override
	public void actualizarActor(Actor actor) {
		// TODO Auto-generated method stub
		this.entityManager.merge(actor);
	}

	@Override
	public Actor buscarActorPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrarActorPorId(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
