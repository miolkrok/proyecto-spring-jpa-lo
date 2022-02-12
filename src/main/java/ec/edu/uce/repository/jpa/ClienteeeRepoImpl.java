package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Clienteee;
@Repository
@Transactional
public class ClienteeeRepoImpl implements IClienteeeRepo{

	private static final Logger LOG =  LoggerFactory.getLogger(FacturaRepoImpl.class);

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void guardar(Clienteee clienteee) {
		// TODO Auto-generated method stub
		this.entityManager.persist(clienteee);
	}
	

}
