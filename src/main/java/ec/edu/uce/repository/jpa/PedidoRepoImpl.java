package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Pedido;

@Repository
@Transactional
public class PedidoRepoImpl implements IPedidoRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarPedido(Pedido pedido) {
		// TODO Auto-generated method stub
		this.entityManager.persist(pedido);
	}

}
