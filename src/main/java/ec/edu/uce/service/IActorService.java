package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.Actor;

public interface IActorService {
	void guardar(Actor actor);
	void actualizar(Actor actor);
}
