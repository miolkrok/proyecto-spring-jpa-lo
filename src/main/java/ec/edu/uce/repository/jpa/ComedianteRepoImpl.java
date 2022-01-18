package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Comediante;

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
		return null;
	}

	@Override
	public void borrarComediantePorId(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
