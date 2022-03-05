package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.CuentaBancaria;
import ec.edu.uce.modelo.jpa.Guardia;

@Repository
@Transactional
public class CuentaBancariaRepoImpl implements ICuentaBancariaRepo{
	
	private static final Logger LOG =  LoggerFactory.getLogger(CuentaBancariaRepoImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarCuentaBancaria(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cuentaBancaria);
	}
	@Transactional(value = TxType.SUPPORTS)
	public void propagacionSupport() {
		
	}

	public void propagacionMandatory() {
		
	}
	@Transactional(value = TxType.NEVER)
	public void enviarMail(String asunto) {
		LOG.info("se envia el mail con asunto: " +asunto);
	}
	@Transactional
	public void enviarMailNoT(String asunto) {
		LOG.info("se envia el mail ");
	}

	@Override
	@Transactional(value = TxType.MANDATORY)
	public void actualizarCuentaBancaria(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cuentaBancaria);
		
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public CuentaBancaria BuscarPorNumeroCuentaBanc(String numero) {
		// TODO Auto-generated method stub
		TypedQuery<CuentaBancaria> myTypedQuery =  (TypedQuery<CuentaBancaria>) this.entityManager.createQuery("select c from CuentaBancaria c where c.numero=: valor");
		myTypedQuery.setParameter("valor", numero);
		
		return myTypedQuery.getSingleResult();
	}

	@Override
	@Transactional(value = TxType.REQUIRES_NEW)
	public void actualizarCuentaBancaria2(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cuentaBancaria);
		
//		try {
//		throw new ArrayIndexOutOfBoundsException();
//		}catch(ArrayIndexOutOfBoundsException e) {
//			LOG.error("ERROR");
//		}


	}

}
