package ec.edu.uce.repository.deberes;

import ec.edu.uce.modelo.deberes.Cliente;

public interface IClienteRepo {
	
	void insertarCliente(Cliente cliente);
	void actualizarCliente(Cliente cliente);
	Cliente buscarCliente(Integer id);
	void borrarCliente(Integer id);
	Cliente buscarClientePorCedula(String cedula);

}
