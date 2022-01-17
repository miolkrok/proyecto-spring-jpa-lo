package ec.edu.uce.service;

import ec.edu.uce.modelo.Carreras;


public interface ICarrerasService {

	void insertarCarrerasNuevo(Carreras carreras);
	void actualizarCarrerasNuevo(Carreras carreras);
	void borrarCarrerasPorId(Integer id);
	Carreras buscarCarrerasPorId(Integer id);
}
