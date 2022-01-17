package ec.edu.uce.service;

import ec.edu.uce.modelo.Cliente;


public interface IClienteService {

	void insertarClienteNuevo(Cliente cliente);
	void actualizarClienteNuevo(Cliente cliente);
	void borrarClientePorId(Integer id);
	Cliente buscarClientePorId(Integer id);
}
