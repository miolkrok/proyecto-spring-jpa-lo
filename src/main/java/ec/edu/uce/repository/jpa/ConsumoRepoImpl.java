package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Consumo;

@Repository
@Transactional
public class ConsumoRepoImpl implements IConsumoRepo {

	
	private static final Logger LOG =  LoggerFactory.getLogger(ConsumoRepoImpl.class);

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarConsumo(Consumo consumo) {
		// TODO Auto-generated method stub
		this.entityManager.persist(consumo);
	}

	@Override
	public void actualizarConsumo(Consumo consumo) {
		// TODO Auto-generated method stub
		this.entityManager.merge(consumo);
	}

}
