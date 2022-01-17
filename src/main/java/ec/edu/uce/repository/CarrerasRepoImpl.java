package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.AlmacenRopa;
import ec.edu.uce.modelo.Carreras;
@Repository
public class CarrerasRepoImpl implements ICarrerasRepo{

	@Autowired
	private JdbcTemplate jdbctemplate;
	@Override
	public void insertarCarreras(Carreras carreras) {
		// TODO Auto-generated method stub
		System.out.println("Aqui se va hacer la conexion para guardar el almacen");
		Object[] datosAInsertar=new Object[] {carreras.getIdCarrera(),carreras.getNombreCarrera(),
				carreras.getUniversidad(),carreras.getFacultad(), carreras.getCursosCarrera()};
		
		this.jdbctemplate.update("insert into carreras(idcarrera,nombrecarrera,universidad,facultad,cursocarrera)values(?,?,?,?,?)"
				, datosAInsertar);
		
	}

	@Override
	public Carreras buscarCarreras(Integer id) {
		// TODO Auto-generated method stub
		Object[] datoBuscar = new Object[] { id};
		return this.jdbctemplate.queryForObject("select * from carreras where idcarrera=?", datoBuscar, new BeanPropertyRowMapper<Carreras>(Carreras.class));
	}

	@Override
	public void actualizarCarreras(Carreras carreras) {
		// TODO Auto-generated method stub
		Object[] datoAActualizar = new Object[] {carreras.getIdCarrera(),carreras.getNombreCarrera(),
				carreras.getUniversidad(),carreras.getFacultad(), carreras.getCursosCarrera(),carreras.getIdCarrera()};
		this.jdbctemplate.update("update carreras SET idcarrera=?,nombrecarrera= ?,universidad= ?,facultad =?, cursocarrera=? where idcarrera=?", datoAActualizar);
	}

	@Override
	public void borrarCarreras(Integer id) {
		// TODO Auto-generated method stub
		Object[] datoABorrar = new Object[] { id };
		this.jdbctemplate.update("delete from carreras where idcarrera=?", datoABorrar);
	}

}
