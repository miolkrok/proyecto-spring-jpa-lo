package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.AlmacenRopa;
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
		Object[] datoBuscar = new Object[] { id};
		return this.jdbctemplate.queryForObject("select * from materia where idmateria=?", datoBuscar, new BeanPropertyRowMapper<Materia>(Materia.class));
	}

	@Override
	public void actualizarMateria(Materia materia) {
		// TODO Auto-generated method stub
		Object[] datoAActualizar = new Object[] { materia.getIdMateria(), materia.getMateria(), materia.getNombreProfesor(),
				materia.getHorasSemanales(),materia.getNumeroEstudiantes(),materia.getIdMateria()};
		this.jdbctemplate.update("update materia SET idmateria=?,materia= ?,nombreprofesor= ?,horassemanales =?, numeroestudiantes=? where idmateria=?", datoAActualizar);
	}

	@Override
	public void borrarMateria(Integer id) {
		// TODO Auto-generated method stub
		Object[] datoABorrar = new Object[] { id };
		this.jdbctemplate.update("delete from materia where idmateria=?", datoABorrar);
	}

}
