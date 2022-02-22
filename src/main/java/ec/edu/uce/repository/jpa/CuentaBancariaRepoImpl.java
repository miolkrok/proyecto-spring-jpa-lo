package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.CuentaBancaria;
import ec.edu.uce.modelo.jpa.Guardia;

@Repository
@Transactional
public class CuentaBancariaRepoImpl implements ICuentaBancariaRepo{
	
	private static final Logger LOG =  LoggerFactory.getLogger(GuardiaRepoImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarCuentaBancaria(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cuentaBancaria);
	}

	@Override
	public void actualizarCuentaBancaria(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cuentaBancaria);
	}

	@Override
	public CuentaBancaria BuscarPorNumeroCuentaBanc(String numero) {
		// TODO Auto-generated method stub
		TypedQuery<CuentaBancaria> myTypedQuery =  (TypedQuery<CuentaBancaria>) this.entityManager.createQuery("select c from CuentaBancaria c where c.numero=: valor");
		myTypedQuery.setParameter("valor", numero);
		
		return myTypedQuery.getSingleResult();
	}

}
