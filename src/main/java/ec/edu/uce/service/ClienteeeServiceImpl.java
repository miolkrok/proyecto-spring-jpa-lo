package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Clienteee;
import ec.edu.uce.repository.jpa.IClienteeeRepo;
@Service
public class ClienteeeServiceImpl implements IClienteeeService{

	@Autowired
	private IClienteeeRepo clienteeeRepo;
	
	@Override
	public void guardar(Clienteee clienteee) {
		// TODO Auto-generated method stub
		this.clienteeeRepo.guardar(clienteee);
	}

}
