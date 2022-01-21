package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Comediante;
import ec.edu.uce.modelo.jpa.Guardia;

@Repository
@Transactional
public class ComedianteRepoImpl implements IComedianteRepo{

	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarComediante(Comediante comediante) {
		// TODO Auto-generated method stub
		this.entityManager.persist(comediante);
	}

	@Override
	public void actualizarComediante(Comediante comediante) {
		// TODO Auto-generated method stub
		this.entityManager.merge(comediante);
	}

	@Override
	public Comediante buscarComediantePorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Comediante.class, id);
	}

	@Override
	public void borrarComediantePorId(Integer id) {
		// TODO Auto-generated method stub
		Comediante guardiaABorrar = this.buscarComediantePorId(id);
		this.entityManager.remove(guardiaABorrar);
	}

	@Override
	public Comediante buscarComediantePorNombre(String nombre) {
		// TODO Auto-generated method stub
		Query miQuery = this.entityManager.createQuery("select g from Comediante g where g.nombre=: valor");
		miQuery.setParameter("valor", nombre);
		Comediante miComediante = (Comediante) miQuery.getSingleResult();
		//Guardia miGuardia = (Guardia) miQuery.getResultList();
		return miComediante;
	}

}
