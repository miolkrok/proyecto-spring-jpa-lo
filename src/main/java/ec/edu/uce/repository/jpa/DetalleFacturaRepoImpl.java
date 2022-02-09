package ec.edu.uce.repository.jpa;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.DetalleFactura;
import ec.edu.uce.modelo.jpa.Factura;

@Repository
@Transactional
public class DetalleFacturaRepoImpl implements IDetalleFacturaRepo{

	private static final Logger LOG =  LoggerFactory.getLogger(DetalleFacturaRepoImpl.class);

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<DetalleFactura> buscarProductos(BigDecimal valorMinimo,  LocalDateTime fecha) {
		// SELECT d FROM DetalleFactura d, Factura f WHERE d= f.detallefactura AND d.precio <=:valorMinimo  f.fecha
		TypedQuery<DetalleFactura> myQuery = this.entityManager
				//.createQuery("SELECT d FROM DetalleFactura d WHERE d.precio <=:valorMinimo",DetalleFactura.class);
				.createQuery("SELECT d FROM DetalleFactura d JOIN d.factura f WHERE  d.precio >=:valorMinimo AND f.fecha <=:fecha",DetalleFactura.class);
		myQuery.setParameter("valorMinimo", valorMinimo);
		myQuery.setParameter("fecha", fecha);
		List<DetalleFactura> milistaDetalleFactura = myQuery.getResultList();
		

		
		LOG.info("LONGITUD Repo:" + milistaDetalleFactura.size());
		for(DetalleFactura f : milistaDetalleFactura) {
			LOG.info("f: " + f.getFactura());//Obtenemos bajo demanda
			LOG.info(f.toString());
		}
		return milistaDetalleFactura;
	}

}
