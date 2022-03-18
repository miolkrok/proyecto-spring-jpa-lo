package ec.edu.uce.repository.deberes;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


import ec.edu.uce.modelo.deberes.PolizaSeguro;

@Repository
@Transactional
public class PolizaSeguroRepoImpl implements IPolizaSeguroRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarPolizaSeguro(PolizaSeguro polizaSeguro) {
		// TODO Auto-generated method stub
		this.entityManager.persist(polizaSeguro);
	}

	@Override
	public void actualizarPolizaSeguro(PolizaSeguro polizaSeguro) {
		// TODO Auto-generated method stub
		this.entityManager.merge(polizaSeguro);
	}

	@Override
	public PolizaSeguro buscarPolizaSeguro(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(PolizaSeguro.class, id);
	}

	@Override
	public void borrarPolizaSeguro(Integer id) {
		// TODO Auto-generated method stub
		PolizaSeguro poliABorrar = this.buscarPolizaSeguro(id);
		this.entityManager.remove(poliABorrar);
	}

}
