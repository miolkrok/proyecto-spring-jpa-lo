package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Auto;

@Repository
@Transactional
public class AutoRepoImpl implements IAutoRepo{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarAuto(Auto auto) {
		// TODO Auto-generated method stub
		this.entityManager.persist(auto);
		
	}

}
