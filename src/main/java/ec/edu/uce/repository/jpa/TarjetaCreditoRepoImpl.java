package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.TarjetaCredito;

@Repository
@Transactional
public class TarjetaCreditoRepoImpl implements ITarjetaCreditoRepo {
	
	private static final Logger LOG =  LoggerFactory.getLogger(TarjetaCreditoRepoImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarTarjetaCredito(TarjetaCredito tarjetaCredito) {
		// TODO Auto-generated method stub
		this.entityManager.persist(tarjetaCredito);
	}

	@Override
	public void actualizarTarjetaCredito(TarjetaCredito tarjetaCredito) {
		// TODO Auto-generated method stub
		this.entityManager.merge(tarjetaCredito);
	}

	@Override
	public TarjetaCredito BuscarPorId(Integer Id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(TarjetaCredito.class, Id);
	}



}
