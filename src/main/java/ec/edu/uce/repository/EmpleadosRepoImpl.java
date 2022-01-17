package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.AlmacenRopa;
import ec.edu.uce.modelo.Empleados;
@Repository
public class EmpleadosRepoImpl implements IEmpleadosRepo{

	@Autowired
	private JdbcTemplate jdbctemplate;
	@Override
	public void insertarEmpleados(Empleados empleados) {
		// TODO Auto-generated method stub
		System.out.println("Aqui se va hacer la conexion para guardar el carro");
		Object[] datosAInsertar = new Object[] { empleados.getIdEmpleado(), empleados.getNombreEmpleado(), empleados.getTiempoTrabajo(),
				empleados.getDireccion(),empleados.getEmail() };

		this.jdbctemplate.update("insert into empleados(idempleado,nombreempleado,tiempotrabajo,direccion,email)values(?,?,?,?,?)", datosAInsertar);
		
	}

	@Override
	public Empleados buscarEmpleados(Integer id) {
		// TODO Auto-generated method stub
		Object[] datoBuscar = new Object[] { id};
		return this.jdbctemplate.queryForObject("select * from empleados where idempleado=?", datoBuscar, new BeanPropertyRowMapper<Empleados>(Empleados.class));
	}

	@Override
	public void actualizarEmpleados(Empleados empleados) {
		// TODO Auto-generated method stub
		Object[] datoAActualizar = new Object[] { empleados.getIdEmpleado(), empleados.getNombreEmpleado(), empleados.getTiempoTrabajo(),
				empleados.getDireccion(),empleados.getEmail(),empleados.getIdEmpleado()};
		this.jdbctemplate.update("update empleados SET idempleado=?,nombreempleado= ?,tiempotrabajo= ?,direccion =?, email=? where idempleado=?", datoAActualizar);
	}

	@Override
	public void borrarEmpleados(Integer id) {
		// TODO Auto-generated method stub
		Object[] datoABorrar = new Object[] { id };
		this.jdbctemplate.update("delete from empleados where idempleado=?", datoABorrar);
	}

}
