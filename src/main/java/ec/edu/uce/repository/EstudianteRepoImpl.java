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
