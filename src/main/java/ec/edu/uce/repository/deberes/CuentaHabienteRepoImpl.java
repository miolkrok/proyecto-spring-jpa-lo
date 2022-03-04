package ec.edu.uce.repository.deberes;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.deberes.CuentaBancariaD;
import ec.edu.uce.modelo.deberes.CuentaHabiente;


@Repository
@Transactional
public class CuentaHabienteRepoImpl implements ICuentaHabienteRepo{
	
	private static final Logger LOG =  LoggerFactory.getLogger(CuentaHabienteRepoImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarCuentaHabiente(CuentaHabiente cuentaHabiente) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cuentaHabiente);
	}

	@Override
	public void actualizarCuentaHabiente(CuentaHabiente cuentaHabiente) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cuentaHabiente);
	}

	@Override
	public CuentaHabiente buscarCuentaHabiente(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(CuentaHabiente.class, id);
	}

	@Override
	public void borrarCuentaHabiente(Integer id) {
		// TODO Auto-generated method stub
		CuentaHabiente cuentaABorrar = this.buscarCuentaHabiente(id);
		this.entityManager.remove(cuentaABorrar);
	}

	@Override
	public CuentaHabiente buscarCuentaHabienteCedula(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<CuentaHabiente> myQuery = 
				this.entityManager
				.createQuery("select c from CuentaHabiente c where c.cedula=:valor",CuentaHabiente.class);
		myQuery.setParameter("valor", cedula);
		
		return myQuery.getSingleResult();
	}

}
