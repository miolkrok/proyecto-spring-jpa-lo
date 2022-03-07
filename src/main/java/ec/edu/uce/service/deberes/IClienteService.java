package ec.edu.uce.service.deberes;

import ec.edu.uce.modelo.deberes.Cliente;

public interface IClienteService {

	void insertarCliente(Cliente cliente);
	void actualizarCliente(Cliente cliente);
	Cliente buscarCliente(Integer id);
	void borrarCliente(Integer id);
	Cliente buscarClientePorCedula(String cedula);
}
