package ec.edu.uce.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Pasajero;

@Repository
@Transactional
public class PasajeroRepoImpl implements IPasajeroRepo {
	
	private static final Logger LOG =  LoggerFactory.getLogger(PasajeroRepoImpl.class);

	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public void insertarPasajero(Pasajero pasajero) {
		// TODO Auto-generated method stub
		this.entityManager.persist(pasajero);
	}
	@Override
	public List<Pasajero> buscarPorCedulaJOIN(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Pasajero> myQuery = this.entityManager
				.createQuery("SELECT f FROM Pasajero f JOIN f.boleto d WHERE f.cedula <=:cedula",Pasajero.class);
		myQuery.setParameter("cedula", cedula);
		List<Pasajero> miListaPasajero = myQuery.getResultList();
		

		
		LOG.info("LONGITUD Repo:" + miListaPasajero.size());
		for(Pasajero f : miListaPasajero) {
			LOG.info("Boleto: " + f.getBoleto());//Obtenemos bajo demanda
			LOG.info(f.toString());
		}
		return miListaPasajero;
	}
	@Override
	public List<Pasajero> buscarPorCedulaJOINLEFT(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Pasajero> myQuery = this.entityManager
				.createQuery("SELECT f FROM Pasajero f LEFT JOIN f.boleto d WHERE f.cedula <=:cedula",Pasajero.class);
		myQuery.setParameter("cedula", cedula);
		
		
		List<Pasajero> miListaPasajero = myQuery.getResultList();
		

		
		LOG.info("LONGITUD Repo:" + miListaPasajero.size());
		for(Pasajero f : miListaPasajero) {
			LOG.info("Boleto: " + f.getBoleto());//Obtenemos bajo demanda
			LOG.info(f.toString());
		}
		return miListaPasajero;
	}
	@Override
	public List<Pasajero> buscarPorCedulaJOINRIGHT(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Pasajero> myQuery = this.entityManager
				.createQuery("SELECT f FROM Pasajero f RIGHT JOIN f.boleto d WHERE f.cedula <=:cedula",Pasajero.class);
		myQuery.setParameter("cedula", cedula);
		
		
		List<Pasajero> miListaPasajero = myQuery.getResultList();
		

		
		LOG.info("LONGITUD Repo:" + miListaPasajero.size());
		for(Pasajero f : miListaPasajero) {
			LOG.info("Boleto: " + f.getBoleto());//Obtenemos bajo demanda
			LOG.info(f.toString());
		}
		return miListaPasajero;
	}
	@Override
	public List<Pasajero> buscarPorCedulaJOINWHERE(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Pasajero> myQuery = this.entityManager
				.createQuery("SELECT f FROM Pasajero f, Boleto d WHERE f = d.pasajero AND f.cedula <=:cedula ",Pasajero.class);
		myQuery.setParameter("cedula", cedula);
		
		List<Pasajero> miListaPasajero = myQuery.getResultList();
	
		
		LOG.info("LONGITUD Repo:" + miListaPasajero.size());
		for(Pasajero f : miListaPasajero) {
			LOG.info("Boleto: " + f.getBoleto());//Obtenemos bajo demanda
			LOG.info(f.toString());
		}
		return miListaPasajero;
	}

}
