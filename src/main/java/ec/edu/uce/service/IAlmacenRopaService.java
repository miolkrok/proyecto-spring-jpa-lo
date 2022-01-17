package ec.edu.uce.service;

import ec.edu.uce.modelo.AlmacenRopa;


public interface IAlmacenRopaService {

	void insertarRopaNuevo(AlmacenRopa almacenRopa);
	void actualizarAlmacenRopaNuevo(AlmacenRopa almacenRopa);
	void borrarAlmacenRopaPorId(Integer id);
	AlmacenRopa buscarAlmacenRopaPorId(Integer id);

}
