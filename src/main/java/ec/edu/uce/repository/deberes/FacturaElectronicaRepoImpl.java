package ec.edu.uce.repository.deberes;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.deberes.FacturaElectronica;

@Repository
@Transactional
public class FacturaElectronicaRepoImpl implements IFacturaElectronicaRepo{
	
	private static final Logger LOG =  LoggerFactory.getLogger(FacturaElectronicaRepoImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarFacturaElectronica(FacturaElectronica facturaElectronica) {
		// TODO Auto-generated method stub
		this.entityManager.persist(facturaElectronica);
	}

	@Override
	public void actualizarFacturaElectronica(FacturaElectronica facturaElectronica) {
		// TODO Auto-generated method stub
		this.entityManager.merge(facturaElectronica);
	}

	@Override
	public FacturaElectronica buscarFacturaElectronica(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(FacturaElectronica.class, id);
	}

	@Override
	public void borrarFacturaElectronica(Integer id) {
		// TODO Auto-generated method stub
		FacturaElectronica factABorrar = this.buscarFacturaElectronica(id);
		this.entityManager.remove(factABorrar);
	}

}
