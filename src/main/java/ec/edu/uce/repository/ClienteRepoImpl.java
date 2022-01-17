package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.AlmacenRopa;
import ec.edu.uce.modelo.Cliente;
@Repository
public class ClienteRepoImpl implements IClienteRepo {

	@Autowired
	private JdbcTemplate jdbctemplate;
	@Override
	public void insertarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		System.out.println("Aqui se va hacer la conexion para guardar el cliente");
		Object[] datosAInsertar = new Object[] { cliente.getIdCliente(), cliente.getNombre(), cliente.getEmail(),
				cliente.getCiudad(),cliente.getTelefono() };

		this.jdbctemplate.update("insert into cliente(idcliente,nombre,email,ciudad,telefono)values(?,?,?,?,?)", datosAInsertar);
	}

	@Override
	public Cliente buscarCliente(Integer id) {
		// TODO Auto-generated method stub
		Object[] datoBuscar = new Object[] { id};
		return this.jdbctemplate.queryForObject("select * from cliente where idcliente=?", datoBuscar, new BeanPropertyRowMapper<Cliente>(Cliente.class));
	}

	@Override
	public void actualizarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		Object[] datoAActualizar = new Object[] {cliente.getIdCliente(), cliente.getNombre(), cliente.getEmail(),
				cliente.getCiudad(),cliente.getTelefono(),cliente.getIdCliente()};
		this.jdbctemplate.update("update cliente SET idcliente=?,nombre= ?,email= ?,ciudad =?, telefono=? where idcliente=?", datoAActualizar);
	}

	@Override
	public void borrarCliente(Integer id) {
		// TODO Auto-generated method stub
		Object[] datoABorrar = new Object[] { id };
		this.jdbctemplate.update("delete from cliente where idcliente=?", datoABorrar);
	}

}
