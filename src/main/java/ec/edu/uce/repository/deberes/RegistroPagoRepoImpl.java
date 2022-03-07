package ec.edu.uce.repository.deberes;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.deberes.RegistroPago;

@Repository
@Transactional
public class RegistroPagoRepoImpl implements IRegistroPagoRepo{
	
	private static final Logger LOG =  LoggerFactory.getLogger(RegistroPagoRepoImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarRegistroPago(RegistroPago registroPago) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarRegistroPago(RegistroPago registroPago) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public RegistroPago buscarRegistroPago(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrarCliente(Integer id) {
		// TODO Auto-generated method stub
		RegistroPago regABorrar = this.buscarRegistroPago(id);
		this.entityManager.remove(regABorrar);
	}

}
