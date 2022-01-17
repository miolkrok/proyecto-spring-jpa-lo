package ec.edu.uce.service;

import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.modelo.ProductosRopa;

public interface IProductosRopaService {
	void insertarProductosRopaNuevo(ProductosRopa productosRopa);
	void actualizarProductosRopaNuevo(ProductosRopa productosRopa);
	void borrarProductosRopaPorId(Integer id);
	ProductosRopa busarProductosRopaPorId(Integer id);
}
