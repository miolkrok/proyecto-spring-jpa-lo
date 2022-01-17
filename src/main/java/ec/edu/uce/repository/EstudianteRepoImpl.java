package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

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
		return null;
	}

	@Override
	public void actualizarEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrarEstudiante(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
