package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
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
		return null;
	}

	@Override
	public void borrarCelularPorId(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
