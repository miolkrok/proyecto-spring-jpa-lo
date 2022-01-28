package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Actor;
import ec.edu.uce.modelo.jpa.Cantante;
import ec.edu.uce.modelo.jpa.Comediante;
import ec.edu.uce.modelo.jpa.Guardia;

@Repository
@Transactional
public class ComedianteRepoImpl implements IComedianteRepo{

	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarComediante(Comediante comediante) {
		// TODO Auto-generated method stub
		this.entityManager.persist(comediante);
	}

	@Override
	public void actualizarComediante(Comediante comediante) {
		// TODO Auto-generated method stub
		this.entityManager.merge(comediante);
	}

	@Override
	public Comediante buscarComediantePorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Comediante.class, id);
	}

	@Override
	public void borrarComediantePorId(Integer id) {
		// TODO Auto-generated method stub
		Comediante guardiaABorrar = this.buscarComediantePorId(id);
		this.entityManager.remove(guardiaABorrar);
	}

	@Override
	public Comediante buscarComediantePorNombre(String nombre) {
		// TODO Auto-generated method stub
		Query miQuery = this.entityManager.createQuery("select g from Comediante g where g.nombre=: valor");
		miQuery.setParameter("valor", nombre);
		Comediante miComediante = (Comediante) miQuery.getSingleResult();
		//Guardia miGuardia = (Guardia) miQuery.getResultList();
		return miComediante;
	}

	@Override
	public Comediante buscarComediantePorNombreTyped(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Comediante> myTypedQuery =  (TypedQuery<Comediante>) this.entityManager.createQuery("select g from Comediante g where g.nombre=: valor");
		myTypedQuery.setParameter("valor", nombre);
		
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Comediante buscarComediantePorNombreNamed(String nombre) {
		// TODO Auto-generated method stub
		Query miQuery = this.entityManager.createNamedQuery("Comediante.buscarPorNombre");
		miQuery.setParameter("valor", nombre);
		return (Comediante) miQuery.getSingleResult();
	}

	@Override
	public Comediante buscarComediantePorNombreNative(String nombre) {
		// TODO Auto-generated method stub
		Query miQuery = this.entityManager.createNativeQuery("select * from Comediante g where g.nombre=:valor", Comediante.class);
		miQuery.setParameter("valor", nombre);
		
		return (Comediante) miQuery.getSingleResult();
	}

	@Override
	public Comediante buscarComediantePorNombreNamedNative(String nombre) {
		// TODO Auto-generated method stub
		Query miQuery = this.entityManager.createNamedQuery("Comediante.buscarPorNombreNamedNative", Comediante.class);
		miQuery.setParameter("valor", nombre);
		
		return (Comediante) miQuery.getSingleResult();
	}

	@Override
	public Comediante buscarComediantePorNombreCriteriaAPI(String nombre) {
		// TODO Auto-generated method stub
		CriteriaBuilder myCriteria = this.entityManager.getCriteriaBuilder(); 
		CriteriaQuery<Comediante> miQuery = myCriteria.createQuery(Comediante.class);
		
		//select * from tabla where 
		//Aqui empiezo a construir mi SQL
		Root<Comediante> myTable = miQuery.from(Comediante.class);
		
		//los where en criteria API se los conoce como predicados
		//select * from Guardia g where g.apellido=: valor
		Predicate p1 = myCriteria.equal(myTable.get("nombre"), nombre);
		 
		//Empezamos a conformar el select 
		miQuery.select(myTable).where(p1);
		
		TypedQuery<Comediante> typedQuery = this.entityManager.createQuery(miQuery);
		
		return typedQuery.getSingleResult();
	}

}
