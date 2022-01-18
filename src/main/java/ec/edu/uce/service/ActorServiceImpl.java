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

}
