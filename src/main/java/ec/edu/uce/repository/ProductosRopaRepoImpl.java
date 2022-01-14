package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.ProductosRopa;
@Repository
public class ProductosRopaRepoImpl implements IProductosRopaRepo{

	@Autowired
	private JdbcTemplate jdbctemplate;
	@Override
	public void insertarProductosRopa(ProductosRopa productosRopa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProductosRopa buscarProductosRopa(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizarProductosRopa(ProductosRopa productosRopa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrarProductosRopa(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
