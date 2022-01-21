package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.Actor;

public interface IActorRepo {

	void insertarActor(Actor actor);
	void actualizarActor(Actor actor);
	Actor buscarActorPorId(Integer id);
	void borrarActorPorId(Integer id);
	Actor buscarActorPorNombre(String nombre);
}
