package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.AlmacenRopa;
import ec.edu.uce.modelo.Estudiante;
@Repository
public class EstudianteRepoImpl implements IEstudianteRepo{

	@Autowired
	private JdbcTemplate jdbctemplate;
	@Override
	public void insertarEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		System.out.println("Aqui se va hacer la conexion para guardar el estudiante");
		Object[] datosAInsertar = new Object[] { estudiante.getIdEstudiante(), estudiante.getNombre(), estudiante.getApellido(),
				estudiante.getCarrera(),estudiante.getEdad() };

		this.jdbctemplate.update("insert into estudiante(idestudiante,nombre,apellido,carrera,edad)values(?,?,?,?,?)", datosAInsertar);
	}

	@Override
	public Estudiante buscarEstudiante(Integer id) {
		// TODO Auto-generated method stub
		Object[] datoBuscar = new Object[] { id};
		return this.jdbctemplate.queryForObject("select * from estudiante where idestudiante=?", datoBuscar, new BeanPropertyRowMapper<Estudiante>(Estudiante.class));
	}

	@Override
	public void actualizarEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		Object[] datoAActualizar = new Object[] { estudiante.getIdEstudiante(), estudiante.getNombre(), estudiante.getApellido(),
				estudiante.getCarrera(),estudiante.getEdad(),estudiante.getIdEstudiante()};
		this.jdbctemplate.update("update estudiante SET idestudiante=?,nombrealmacen= ?,nombrepropietario= ?,ropa =?, precio=? where idestudiante=?", datoAActualizar);
	}

	@Override
	public void borrarEstudiante(Integer id) {
		// TODO Auto-generated method stub
		Object[] datoABorrar = new Object[] { id };
		this.jdbctemplate.update("delete from estudiante where idestudiante=?", datoABorrar);
	}

}
