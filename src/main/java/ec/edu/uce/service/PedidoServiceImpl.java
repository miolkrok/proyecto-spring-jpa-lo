package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Pedido;
import ec.edu.uce.repository.jpa.IPedidoRepo;

@Service
public class PedidoServiceImpl implements IPedidoService{

	@Autowired
	private IPedidoRepo pedidoRepo;
	
	@Override
	public void guardarPedido(Pedido pedido) {
		// TODO Auto-generated method stub
		this.pedidoRepo.insertarPedido(pedido);
	}

}
