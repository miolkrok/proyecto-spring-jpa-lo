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
	@Override
	public void actualizarClienteNuevo(Cliente cliente) {
		// TODO Auto-generated method stub
		this.clienteRepo.actualizarCliente(cliente);
	}
	@Override
	public void borrarClientePorId(Integer id) {
		// TODO Auto-generated method stub
		this.clienteRepo.borrarCliente(id);
	}
	@Override
	public Cliente buscarClientePorId(Integer id) {
		// TODO Auto-generated method stub
		return this.clienteRepo.buscarCliente(id);
	}


}
