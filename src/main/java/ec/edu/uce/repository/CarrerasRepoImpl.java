package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

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
		return null;
	}

	@Override
	public void actualizarCarreras(Carreras carreras) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrarCarreras(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
