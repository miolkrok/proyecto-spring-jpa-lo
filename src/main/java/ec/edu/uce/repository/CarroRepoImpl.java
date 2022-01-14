package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Carro;
@Repository
public class CarroRepoImpl implements ICarroRepo {

	@Autowired
	private JdbcTemplate jdbctemplate;
	@Override
	public void insertarCarro(Carro carro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Carro buscarCarro(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizarCarro(Carro carro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrarCarro(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
