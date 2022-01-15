package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Paciente;

@Repository
public class PacienteRepoImpl implements IPacienteRepo {

	@Autowired
	private JdbcTemplate jdbctemplate;

	@Override
	public void insertarPaciente(Paciente paciente) {
		// insert into paciente(id,nombre,apellido,edad)values(1,'luis','ortiz',24)
		// mi arreglo de los datos a insertar
		System.out.println("Aqui se va hacer la conexion para guardar el paciente");
		Object[] datosAInsertar = new Object[] { paciente.getId(), paciente.getNombre(), paciente.getApellido(),
				paciente.getEdad() };

		this.jdbctemplate.update("insert into paciente(id,nombre,apellido,edad)values(?,?,?,?)", datosAInsertar);

	}

	@Override
	public Paciente buscarPaciente(Integer id) {
		// select * from paciente where id=1
		Object[] datoBuscar = new Object[] { id};
	return this.jdbctemplate.queryForObject("select * from paciente where id=?", datoBuscar, new BeanPropertyRowMapper<Paciente>(Paciente.class));
		 
	}

	@Override
	public void actualizarPaciente(Paciente paciente) {
		// update paciente SET id=1,nombre= 'alexander',apellido= 'laguapillo',edad =23
		// where id=1
		Object[] datoAActualizar = new Object[] { paciente.getId(),paciente.getNombre(),paciente.getApellido(),paciente.getEdad(), paciente.getId()};
		this.jdbctemplate.update("update paciente SET id=?,nombre= ?,apellido= ?,edad =? where id=?", datoAActualizar);

	}

	@Override
	public void borrarPaciente(Integer id) {
		// delete from paciente where id=1
		Object[] datoABorrar = new Object[] { id };
		this.jdbctemplate.update("delete from paciente where id=?", datoABorrar);

	}

}
