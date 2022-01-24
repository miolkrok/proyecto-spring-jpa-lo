package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Actor;
import ec.edu.uce.repository.jpa.IActorRepo;
@Service
public class ActorServiceImpl implements IActorService {

	@Autowired
	private IActorRepo actorRepo;
	
	@Override
	public void guardar(Actor actor) {
		// TODO Auto-generated method stub
		this.actorRepo.insertarActor(actor);
	}

	@Override
	public void actualizar(Actor actor) {
		// TODO Auto-generated method stub
		this.actorRepo.actualizarActor(actor);
	}

	@Override
	public Actor buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.actorRepo.buscarActorPorId(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.actorRepo.borrarActorPorId(id);
	}

	@Override
	public Actor buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.actorRepo.buscarActorPorNombre(nombre);
	}

	@Override
	public Actor buscarPorNombreTyped(String nombre) {
		// TODO Auto-generated method stub
		return this.actorRepo.buscarActorPorNombreTyped(nombre);
	}

	@Override
	public Actor buscarPorNombreNamed(String nombre) {
		// TODO Auto-generated method stub
		return this.actorRepo.buscarActorPorNombreNamed(nombre);
	}

}
