package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Actor;
import ec.edu.uce.modelo.jpa.Guardia;



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
		return this.entityManager.find(Actor.class, id);
	}

	@Override
	public void borrarActorPorId(Integer id) {
		// TODO Auto-generated method stub
		Actor actorABorrar = this.buscarActorPorId(id);
		this.entityManager.remove(actorABorrar);
	}

	@Override
	public Actor buscarActorPorNombre(String nombre) {
		// TODO Auto-generated method stub
		Query miQuery = this.entityManager.createQuery("select g from Actor g where g.nombre=: valor");
		miQuery.setParameter("valor", nombre);
		Actor miActor = (Actor) miQuery.getSingleResult();
		//Guardia miGuardia = (Guardia) miQuery.getResultList();
		return miActor;
	}

	@Override
	public Actor buscarActorPorNombreTyped(String nombre) {
		TypedQuery<Actor> myTypedQuery =  (TypedQuery<Actor>) this.entityManager.createQuery("select g from Actor g where g.nombre=: valor");
		myTypedQuery.setParameter("valor", nombre);
		
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Actor buscarActorPorNombreNamed(String nombre) {
		// TODO Auto-generated method stub
		Query miQuery = this.entityManager.createNamedQuery("Actor.buscarPorNombre");
		miQuery.setParameter("valor", nombre);
		return (Actor) miQuery.getSingleResult();
	}



}
