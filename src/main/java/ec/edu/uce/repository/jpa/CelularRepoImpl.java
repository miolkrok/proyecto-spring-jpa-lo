package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Celular;

@Repository
@Transactional
public class CelularRepoImpl implements ICelularRepo {

	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarCelular(Celular celular) {
		// TODO Auto-generated method stub
		this.entityManager.persist(celular);
	}

	@Override
	public void actualizarCelular(Celular celular) {
		// TODO Auto-generated method stub
		this.entityManager.merge(celular);
	}

	@Override
	public Celular buscarCelularPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Celular.class, id);
	}

	@Override
	public void borrarCelularPorId(Integer id) {
		// TODO Auto-generated method stub
		Celular celularABorrar = this.buscarCelularPorId(id);
		this.entityManager.remove(celularABorrar);
	}

	@Override
	public Celular buscarCelularPorMarca(String marca) {
		// TODO Auto-generated method stub
		Query miQuery = this.entityManager.createQuery("select g from Celular g where g.marca=: valor");
		miQuery.setParameter("valor", marca);
		Celular miCelular = (Celular) miQuery.getSingleResult();
		//Guardia miGuardia = (Guardia) miQuery.getResultList();
		return miCelular;
	}

}
