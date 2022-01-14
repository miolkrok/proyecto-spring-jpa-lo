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
