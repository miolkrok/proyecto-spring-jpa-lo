package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.Comediante;

public interface IComedianteService {
	void guardar(Comediante comediante);
	void actualizar(Comediante comediante);
	Comediante buscar(Integer id);
	void borrar(Integer id);
	Comediante buscarPorNombre(String nombre);
	Comediante buscarPorNombreTyped(String nombre);
	Comediante buscarPorNombreNamed(String nombre);
	Comediante buscarPorNombreNative(String nombre);
	Comediante buscarPorNombreNamedNative(String nombre);
	Comediante buscarPorNombreCriteriaAPI(String nombre);
}
