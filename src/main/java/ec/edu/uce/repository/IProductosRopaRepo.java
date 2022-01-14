package ec.edu.uce.repository;

import ec.edu.uce.modelo.ProductosRopa;

public interface IProductosRopaRepo {
	void insertarProductosRopa(ProductosRopa productosRopa);
	ProductosRopa buscarProductosRopa(Integer id);
	void actualizarProductosRopa(ProductosRopa productosRopa);
	void borrarProductosRopa(Integer id);
}
