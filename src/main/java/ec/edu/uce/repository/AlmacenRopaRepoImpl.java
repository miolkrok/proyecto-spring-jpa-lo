package ec.edu.uce.repository;

import ec.edu.uce.modelo.AlmacenRopa;
import ec.edu.uce.modelo.Paciente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AlmacenRopaRepoImpl implements IAlmacenRopaRepo{

	@Autowired
	private JdbcTemplate jdbctemplate;
	@Override
	public void insertarRopa(AlmacenRopa almacenRopa) {
		// TODO Auto-generated method stub
		System.out.println("Aqui se va hacer la conexion para guardar el almacen");
		Object[] datosAInsertar=new Object[] {almacenRopa.getId(),almacenRopa.getNombreAlmacen(),
				almacenRopa.getNombrePropietario(),almacenRopa.getRopa(), almacenRopa.getPrecio()};
		
		this.jdbctemplate.update("insert into almacenropa(id,nombrealmacen,nombrepropietario,ropa,precio)values(?,?,?,?,?)"
				, datosAInsertar);
		
	}

	@Override
	public AlmacenRopa buscarRopa(Integer id) {
		// TODO Auto-generated method stub
		Object[] datoBuscar = new Object[] { id};
		return this.jdbctemplate.queryForObject("select * from almacenropa where id=?", datoBuscar, new BeanPropertyRowMapper<AlmacenRopa>(AlmacenRopa.class));
	}

	@Override
	public void actualizarRopa(AlmacenRopa almacenRopa) {
		// TODO Auto-generated method stub
		Object[] datoAActualizar = new Object[] {almacenRopa.getId(),almacenRopa.getNombreAlmacen(),
				almacenRopa.getNombrePropietario(),almacenRopa.getRopa(), almacenRopa.getPrecio(),almacenRopa.getId()};
		this.jdbctemplate.update("update almacenropa SET id=?,nombrealmacen= ?,nombrepropietario= ?,ropa =?, precio=? where id=?", datoAActualizar);
	}

	@Override
	public void borrarRopa(Integer id) {
		// TODO Auto-generated method stub
		Object[] datoABorrar = new Object[] { id };
		this.jdbctemplate.update("delete from almacenropa where id=?", datoABorrar);
	}

}
