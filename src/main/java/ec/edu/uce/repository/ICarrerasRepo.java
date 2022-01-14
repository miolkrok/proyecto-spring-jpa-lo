package ec.edu.uce.repository;

import ec.edu.uce.modelo.Carreras;


public interface ICarrerasRepo {

	void insertarCarreras(Carreras carreras);
	Carreras buscarCarreras(Integer id);
	void actualizarCarreras(Carreras carreras);
	void borrarCarreras(Integer id);
}
