package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Cliente;
@Repository
public class ClienteRepoImpl implements IClienteRepo {

	@Autowired
	private JdbcTemplate jdbctemplate;
	@Override
	public void insertarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente buscarCliente(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrarCliente(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
