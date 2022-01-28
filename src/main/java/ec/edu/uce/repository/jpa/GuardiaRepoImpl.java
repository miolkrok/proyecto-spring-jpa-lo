package ec.edu.uce.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Guardia;



/**
 * @author Luis
 *
 */


@Repository
@Transactional
public class GuardiaRepoImpl implements IGuardiaRepo {
	
	private static final Logger LOG =  LoggerFactory.getLogger(GuardiaRepoImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarGuardia(Guardia guardia) {
		// TODO Auto-generated method stub
		this.entityManager.persist(guardia);
	}

	@Override
	public void actualizarGuardia(Guardia guardia) {
		// TODO Auto-generated method stub
		this.entityManager.merge(guardia);
	}

	@Override
	public Guardia buscarGuardiaPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Guardia.class, id);
	}

	@Override
	public void borrarGuardiaPorId(Integer id) {
		// TODO Auto-generated method stub
		Guardia guardiaABorrar = this.buscarGuardiaPorId(id);
		this.entityManager.remove(guardiaABorrar);
	}

	@Override
	public Guardia buscarGuardiaPorApellido(String apellido) {
		// select * from guardia where apellido='MVN'
		// JPQL: select * from Guardia g where g.apellido=: valor
		Guardia g = null;
		try {
		Query miQuery = this.entityManager.createQuery("select g from Guardia g where g.apellido=: valor");
		miQuery.setParameter("valor", apellido);
		//Guardia miGuardia = (Guardia) miQuery.getSingleResult();
		//Guardia miGuardia = (Guardia) miQuery.getResultList();
		g = (Guardia) miQuery.getSingleResult();
		}catch(NoResultException e){
			LOG.error("No existe un resultado para:" +apellido, e);
		}
		return g;
	}
	/*
	 * Este metodo es igual que el buscarGuardiaPorApellido nada mas que con TypedQuery
	 */
	public Guardia buscarGuardiaPorApellidoType(String apellido) {
		TypedQuery<Guardia> myTypedQuery =  (TypedQuery<Guardia>) this.entityManager.createQuery("select g from Guardia g where g.apellido=: valor");
		myTypedQuery.setParameter("valor", apellido);
		
		return myTypedQuery.getSingleResult();
	}

	/*
	 * Este metodo es igual que el buscarGuardiaPorApellido nada mas que con NamedQuery
	 */
	@Override
	public Guardia buscarGuardiaPorApellidoNamed(String apellido) {
		Query miQuery = this.entityManager.createNamedQuery("Guardia.buscarPorApellido");
		miQuery.setParameter("valor", apellido);
		return (Guardia) miQuery.getSingleResult();
	}

	@Override
	public Guardia buscarGuardiaPorApellidoNative(String apellido) {
		// TODO Auto-generated method stub
		Query miQuery = this.entityManager.createNativeQuery("select * from guardia g where g.apellido=:valor", Guardia.class);
		miQuery.setParameter("valor", apellido);
		
		return (Guardia) miQuery.getSingleResult();
	}

	@Override
	public Guardia buscarGuardiaPorApellidoNamedNative(String apellido) {
		// TODO Auto-generated method stub
		Query miQuery = this.entityManager.createNamedQuery("Guardia.buscarPorApellidoNative", Guardia.class);
		miQuery.setParameter("valor", apellido);
		
		return (Guardia) miQuery.getSingleResult();
	}

	@Override
	public Guardia buscarGuardiaPorApellidoCriteriaAPI(String apellido) {
		// TODO Auto-generated method stub
		CriteriaBuilder myCriteria = this.entityManager.getCriteriaBuilder(); 
		CriteriaQuery<Guardia> miQuery = myCriteria.createQuery(Guardia.class);
		
		//select * from tabla where 
		//Aqui empiezo a construir mi SQL
		Root<Guardia> myTable = miQuery.from(Guardia.class);
		
		//los where en criteria API se los conoce como predicados
		//select * from Guardia g where g.apellido=: valor
		Predicate p1 = myCriteria.equal(myTable.get("apellido"), apellido);
		 
		//Empezamos a conformar el select 
		miQuery.select(myTable).where(p1);
		
		TypedQuery<Guardia> typedQuery = this.entityManager.createQuery(miQuery);
		
		return typedQuery.getSingleResult();
	}
	@Override
	public Guardia buscarGuardiaPorApellidoLista(String apellido) {
		// TODO Auto-generated method stub
		
		Query miQuery = this.entityManager.createQuery("select g from Guardia g where g.apellido=: valor");
		miQuery.setParameter("valor", apellido);
		//Guardia miGuardia = (Guardia) miQuery.getSingleResult();
		//Guardia miGuardia = (Guardia) miQuery.getResultList();
		List<Guardia> listaDeGuardias = miQuery.getResultList();
		if(!listaDeGuardias.isEmpty()) {
			LOG.info("Tiene mas de un registro: "+listaDeGuardias.size());
			return listaDeGuardias.get(0);
		}else {
			return null;
		}
	
		
	}

	@Override
	public Guardia buscarGuardiaPorApellidoCriteriaAPIAnd(String apellido,String edificio) {
		// TODO Auto-generated method stub
		CriteriaBuilder myCriteria = this.entityManager.getCriteriaBuilder(); 
		CriteriaQuery<Guardia> miQuery = myCriteria.createQuery(Guardia.class);
		
		//select * from tabla where 
		//Aqui empiezo a construir mi SQL
		Root<Guardia> myTable = miQuery.from(Guardia.class);
		
		//los where en criteria API se los conoce como predicados
		//select * from Guardia g where g.apellido=: valor and edificio = ''villaflora
		Predicate p1 = myCriteria.equal(myTable.get("apellido"), apellido);
		Predicate p2 = myCriteria.equal(myTable.get("edificio"), edificio);
		Predicate predicadoFinal = myCriteria.and(p1,p2);
		//Empezamos a conformar el select 
		miQuery.select(myTable).where(predicadoFinal);
		
		TypedQuery<Guardia> typedQuery = this.entityManager.createQuery(miQuery);
		
		return typedQuery.getSingleResult();
	}

	@Override
	public List<Guardia> buscarGuardiaPorApellidoCriteriaAPIOr(String apellido, String edificio) {
		// TODO Auto-generated method stub
		CriteriaBuilder myCriteria = this.entityManager.getCriteriaBuilder(); 
		CriteriaQuery<Guardia> miQuery = myCriteria.createQuery(Guardia.class);
		
		//select * from tabla where 
		//Aqui empiezo a construir mi SQL
		Root<Guardia> myTable = miQuery.from(Guardia.class);
		
		//los where en criteria API se los conoce como predicados
		//select * from Guardia g where g.apellido=: valor or edificio = ''villaflora
		Predicate p1 = myCriteria.equal(myTable.get("apellido"), apellido);
		Predicate p2 = myCriteria.equal(myTable.get("edificio"), edificio);
		Predicate predicadoFinal = myCriteria.or(p1,p2);
		//Empezamos a conformar el select 
		miQuery.select(myTable).where(predicadoFinal);
		
		TypedQuery<Guardia> typedQuery = this.entityManager.createQuery(miQuery);
		
		return typedQuery.getResultList();
	}


		





}
