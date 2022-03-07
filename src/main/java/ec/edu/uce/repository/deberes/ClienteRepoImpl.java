package ec.edu.uce.repository.deberes;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.deberes.Cliente;
import ec.edu.uce.modelo.deberes.CuentaBancariaD;

@Repository
@Transactional
public class ClienteRepoImpl implements IClienteRepo {

	private static final Logger LOG =  LoggerFactory.getLogger(ClienteRepoImpl.class);

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cliente);
	}

	@Override
	public void actualizarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cliente);
	}

	@Override
	public Cliente buscarCliente(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Cliente.class, id);
	}

	@Override
	public void borrarCliente(Integer id) {
		// TODO Auto-generated method stub
		Cliente clienteABorrar = this.buscarCliente(id);
		this.entityManager.remove(clienteABorrar);
	}

	@Override
	public Cliente buscarClientePorCedula(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Cliente> myQuery = 
				this.entityManager
				.createQuery("SELECT c FROM Cliente c WHERE c.cedula=:valor",Cliente.class);
		myQuery.setParameter("valor", cedula);
		
		return myQuery.getSingleResult();
	}

}
