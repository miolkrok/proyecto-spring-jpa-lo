package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.Actor;

public interface IActorService {
	void guardar(Actor actor);
	void actualizar(Actor actor);
	Actor buscar(Integer id);
	void borrar(Integer id);
	Actor buscarPorNombre(String nombre);
	Actor buscarPorNombreTyped(String nombre);
	Actor buscarPorNombreNamed(String nombre);
	Actor buscarPorNombreNative(String nombre);
	Actor buscarPorNombreNamedNative(String nombre);
	Actor buscarPorNombreCriteriaAPI(String nombre);
}
