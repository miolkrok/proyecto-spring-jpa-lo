package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Guardia;

@Repository
@Transactional
public class GuardiaRepoImpl implements IGuardiaRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarGuardia(Guardia guardia) {
		// TODO Auto-generated method stub
		this.entityManager.persist(guardia);
	}

	@Override
	public void actualizarGuardia(Guardia guardia) {
		// TODO Auto-generated method stub
		this.entityManager.merge(guardia);
	}

	@Override
	public Guardia buscarGuardiaPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Guardia.class, id);
	}

	@Override
	public void borrarGuardiaPorId(Integer id) {
		// TODO Auto-generated method stub
		Guardia guardiaABorrar = this.buscarGuardiaPorId(id);
		this.entityManager.remove(guardiaABorrar);
	}

	@Override
	public Guardia buscarGuardiaPorApellido(String apellido) {
		// select * from guardia where apellido='MVN'
		// JPQL: select * from Guardia g where g.apellido=: valor
		Query miQuery = this.entityManager.createQuery("select g from Guardia g where g.apellido=: valor");
		miQuery.setParameter("valor", apellido);
		Guardia miGuardia = (Guardia) miQuery.getSingleResult();
		//Guardia miGuardia = (Guardia) miQuery.getResultList();
		return miGuardia;
	}

}
