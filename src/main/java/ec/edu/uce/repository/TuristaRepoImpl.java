package ec.edu.uce.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Turista;
import ec.edu.uce.modelo.jpa.Factura;
@Repository
@Transactional
public class TuristaRepoImpl implements ITuristaRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarTurista(Turista turista) {
		// TODO Auto-generated method stub
		this.entityManager.persist(turista);
	}

	@Override
	public List<Turista> obtenerTodosTuristas(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Turista> myQuery = this.entityManager
				.createQuery("select t from Turista t where t.nombre=: valor",Turista.class);
		myQuery.setParameter("valor", nombre);
		return  myQuery.getResultList();
	}

}
