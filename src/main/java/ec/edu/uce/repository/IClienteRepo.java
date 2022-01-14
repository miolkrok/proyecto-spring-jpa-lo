package ec.edu.uce.repository;

import ec.edu.uce.modelo.Cliente;


public interface IClienteRepo {

	void insertarCliente(Cliente cliente);
	Cliente buscarCliente(Integer id);
	void actualizarCliente(Cliente cliente);
	void borrarCliente(Integer id);
}
