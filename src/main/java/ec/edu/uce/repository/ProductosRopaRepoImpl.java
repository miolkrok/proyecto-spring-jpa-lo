package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.AlmacenRopa;
import ec.edu.uce.modelo.ProductosRopa;
@Repository
public class ProductosRopaRepoImpl implements IProductosRopaRepo{

	@Autowired
	private JdbcTemplate jdbctemplate;
	@Override
	public void insertarProductosRopa(ProductosRopa productosRopa) {
		// TODO Auto-generated method stub
		System.out.println("Aqui se va hacer la conexion para guardar el productosRopa");
		Object[] datosAInsertar = new Object[] { productosRopa.getIdProducto(), productosRopa.getNombreProducto(), productosRopa.getPrecioRopa(),
				productosRopa.getColor(),productosRopa.getTalla() };

		this.jdbctemplate.update("insert into productosropa(idproducto,nombreproducto,precioropa,color,talla)values(?,?,?,?,?)", datosAInsertar);
	}

	@Override
	public ProductosRopa buscarProductosRopa(Integer id) {
		// TODO Auto-generated method stub
		Object[] datoBuscar = new Object[] { id};
		return this.jdbctemplate.queryForObject("select * from productosropa where idproducto=?", datoBuscar, new BeanPropertyRowMapper<ProductosRopa>(ProductosRopa.class));
	}

	@Override
	public void actualizarProductosRopa(ProductosRopa productosRopa) {
		// TODO Auto-generated method stub
		Object[] datoAActualizar = new Object[] {productosRopa.getIdProducto(), productosRopa.getNombreProducto(), productosRopa.getPrecioRopa(),
				productosRopa.getColor(),productosRopa.getTalla(),productosRopa.getIdProducto()};
		this.jdbctemplate.update("update productosropa SET idproducto=?,nombreproducto= ?,precioropa= ?,color =?, talla=? where idproducto=?", datoAActualizar);
	}

	@Override
	public void borrarProductosRopa(Integer id) {
		// TODO Auto-generated method stub
		Object[] datoABorrar = new Object[] { id };
		this.jdbctemplate.update("delete from productosropa where idproducto=?", datoABorrar);
	}

}
