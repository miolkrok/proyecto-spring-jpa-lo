package ec.edu.uce.repository;

import ec.edu.uce.modelo.AlmacenRopa;


public interface IAlmacenRopaRepo {

	void insertarRopa(AlmacenRopa almacenRopa);
	AlmacenRopa buscarRopa(Integer id);
	void actualizarRopa(AlmacenRopa almacenRopa);
	void borrarRopa(Integer id);
}
