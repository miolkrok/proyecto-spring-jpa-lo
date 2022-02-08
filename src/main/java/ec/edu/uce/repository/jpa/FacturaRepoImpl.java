package ec.edu.uce.repository.jpa;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Factura;

@Repository
@Transactional
public class FacturaRepoImpl implements IFacturaRepo {
	
	private static final Logger LOG =  LoggerFactory.getLogger(FacturaRepoImpl.class);

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarFactura(Factura factura) {
		// TODO Auto-generated method stub
		this.entityManager.persist(factura);
	}

	@Override
	public List<Factura> buscarPorFechaJOIN(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		TypedQuery<Factura> myQuery = this.entityManager
				.createQuery("SELECT f FROM Factura f JOIN f.detalles d WHERE f.fecha <=:fecha",Factura.class);
		myQuery.setParameter("fecha", fecha);
		List<Factura> milistaFactura = myQuery.getResultList();
		

		
		LOG.info("LONGITUD Repo:" + milistaFactura.size());
		for(Factura f : milistaFactura) {
			LOG.info("detalles: " + f.getDetalles());//Obtenemos bajo demanda
			LOG.info(f.toString());
		}
		return milistaFactura;
	}
	
	@Override
	public List<Factura> buscarPorFechaJOINLEFT(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		TypedQuery<Factura> myQuery = this.entityManager
				.createQuery("SELECT f FROM Factura f LEFT JOIN f.detalles d WHERE f.fecha <=:fecha",Factura.class);
		myQuery.setParameter("fecha", fecha);
		
		
		List<Factura> milistaFactura = myQuery.getResultList();
		

		
		LOG.info("LONGITUD Repo:" + milistaFactura.size());
		for(Factura f : milistaFactura) {
			LOG.info("detalles: " + f.getDetalles());//Obtenemos bajo demanda
			LOG.info(f.toString());
		}
		return milistaFactura;
	}

	@Override
	public List<Factura> buscarPorFechaWHERE(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		TypedQuery<Factura> myQuery = this.entityManager
				.createQuery("SELECT f FROM Factura f, DetalleFactura d WHERE f = d.factura AND f.fecha <=:fecha ",Factura.class);
		myQuery.setParameter("fecha", fecha);
		
		List<Factura> milistaFactura = myQuery.getResultList();
	
		
		LOG.info("LONGITUD Repo:" + milistaFactura.size());
		for(Factura f : milistaFactura) {
			LOG.info("detalles: " + f.getDetalles());//Obtenemos bajo demanda
			LOG.info(f.toString());
		}
		return milistaFactura;
	
	}


}
