package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Materia;
@Repository
public class MateriaRepoImpl implements IMateriaRepo{

	@Autowired
	private JdbcTemplate jdbctemplate;
	@Override
	public void insertarMateria(Materia materia) {
		// TODO Auto-generated method stub
		System.out.println("Aqui se va hacer la conexion para guardar el materia");
		Object[] datosAInsertar = new Object[] { materia.getIdMateria(), materia.getMateria(), materia.getNombreProfesor(),
				materia.getHorasSemanales(),materia.getNumeroEstudiantes() };

		this.jdbctemplate.update("insert into materia(idmateria,materia,nombreprofesor,horassemanales,numeroestudiantes)values(?,?,?,?,?)", datosAInsertar);
	}

	@Override
	public Materia buscarMateria(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizarMateria(Materia materia) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrarMateria(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
