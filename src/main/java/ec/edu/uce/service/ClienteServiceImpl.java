package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Cliente;
import ec.edu.uce.repository.IClienteRepo;
@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private IClienteRepo clienteRepo;
	@Override
	public void insertarClienteNuevo(Cliente cliente) {
		// TODO Auto-generated method stub
		this.clienteRepo.insertarCliente(cliente);
	}


}
