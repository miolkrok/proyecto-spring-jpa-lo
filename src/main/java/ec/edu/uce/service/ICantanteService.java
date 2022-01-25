package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.Cantante;

public interface ICantanteService {
	void guardar(Cantante cantante);
	void actualizar(Cantante cantante);
	Cantante buscar(Integer id);
	void borrar(Integer id);
	Cantante buscarPorNombre(String nombre);
	Cantante buscarPorNombreTyped(String nombre);
	Cantante buscarPorNombreNamed(String nombre);
	Cantante buscarPorNombreNative(String nombre);
}
