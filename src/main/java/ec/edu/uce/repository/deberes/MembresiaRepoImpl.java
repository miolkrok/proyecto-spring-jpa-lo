package ec.edu.uce.repository.deberes;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.deberes.Cliente;
import ec.edu.uce.modelo.deberes.Membresia;

@Repository
@Transactional
public class MembresiaRepoImpl implements IMembresiaRepo {
	
	private static final Logger LOG =  LoggerFactory.getLogger(MembresiaRepoImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarMembresia(Membresia membresia) {
		// TODO Auto-generated method stub
		this.entityManager.persist(membresia);
	}

	@Override
	public void actualizarMembresia(Membresia membresia) {
		// TODO Auto-generated method stub
		this.entityManager.merge(membresia);
	}

	@Override
	public Membresia buscarMembresia(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Membresia.class, id);
	}

	@Override
	public void borrarCliente(Integer id) {
		// TODO Auto-generated method stub
		Membresia membABorrar = this.buscarMembresia(id);
		this.entityManager.remove(membABorrar);
	}

	@Override
	public Membresia buscarMembresia(String codigo) {
		// TODO Auto-generated method stub
		TypedQuery<Membresia> myQuery = 
				this.entityManager
				.createQuery("SELECT c FROM Membresia c WHERE c.codigo=:valor",Membresia.class);
		myQuery.setParameter("valor", codigo);
		
		return myQuery.getSingleResult();
	}

}
