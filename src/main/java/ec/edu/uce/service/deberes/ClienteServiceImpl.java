package ec.edu.uce.service.deberes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.deberes.Cliente;
import ec.edu.uce.repository.deberes.IClienteRepo;

@Service
public class ClienteServiceImpl implements IClienteService{
	
	@Autowired
	private IClienteRepo clienteRepo;

	@Override
	public void insertarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		this.clienteRepo.insertarCliente(cliente);
	}

	@Override
	public void actualizarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		this.clienteRepo.actualizarCliente(cliente);
	}

	@Override
	public Cliente buscarCliente(Integer id) {
		// TODO Auto-generated method stub
		return this.clienteRepo.buscarCliente(id);
	}

	@Override
	public void borrarCliente(Integer id) {
		// TODO Auto-generated method stub
		this.clienteRepo.borrarCliente(id);
	}

	@Override
	public Cliente buscarClientePorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.clienteRepo.buscarClientePorCedula(cedula);
	}

}
