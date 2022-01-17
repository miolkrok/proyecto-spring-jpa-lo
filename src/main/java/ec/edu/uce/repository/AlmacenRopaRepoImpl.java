package ec.edu.uce.repository;

import ec.edu.uce.modelo.AlmacenRopa;

import org.springframework.beans.factory.annotation.Autowired;
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
		return null;
	}

	@Override
	public void actualizarRopa(AlmacenRopa almacenRopa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrarRopa(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
