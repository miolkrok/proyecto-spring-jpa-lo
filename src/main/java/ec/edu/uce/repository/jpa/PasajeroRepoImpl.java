package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Pasajero;

@Repository
@Transactional
public class PasajeroRepoImpl implements IPasajeroRepo {

	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public void insertarPasajero(Pasajero pasajero) {
		// TODO Auto-generated method stub
		this.entityManager.persist(pasajero);
	}

}
