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


@Repository
@Transactional
public class CantanteRepoImpl implements ICantanteRepo {

	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarCantante(Cantante cantante) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cantante);
	}

	@Override
	public void actualizarCantante(Cantante cantante) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cantante);
	}

	@Override
	public Cantante buscarCantantePorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Cantante.class, id);
	}

	@Override
	public void borrarCantantePorId(Integer id) {
		// TODO Auto-generated method stub
		Cantante cantanteABorrar = this.buscarCantantePorId(id);
		this.entityManager.remove(cantanteABorrar);
	}

	@Override
	public Cantante buscarCantantePorNombre(String nombre) {
		// TODO Auto-generated method stub
		Query miQuery = this.entityManager.createQuery("select g from Cantante g where g.nombre=: valor");
		miQuery.setParameter("valor", nombre);
		Cantante miCantante = (Cantante) miQuery.getSingleResult();
		//Guardia miGuardia = (Guardia) miQuery.getResultList();
		return miCantante;
	}

	@Override
	public Cantante buscarCantantePorNombreTyped(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Cantante> myTypedQuery =  (TypedQuery<Cantante>) this.entityManager.createQuery("select g from Cantante g where g.nombre=: valor");
		myTypedQuery.setParameter("valor", nombre);
		
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Cantante buscarCantantePorNombreNamed(String nombre) {
		// TODO Auto-generated method stub
		Query miQuery = this.entityManager.createNamedQuery("Cantante.buscarPorNombre");
		miQuery.setParameter("valor", nombre);
		return (Cantante) miQuery.getSingleResult();
	}

	@Override
	public Cantante buscarCantantePorNombreNative(String nombre) {
		// TODO Auto-generated method stub
		Query miQuery = this.entityManager.createNativeQuery("select * from Cantante g where g.nombre=:valor", Cantante.class);
		miQuery.setParameter("valor", nombre);
		
		return (Cantante) miQuery.getSingleResult();
	}

	@Override
	public Cantante buscarCantantePorNombreNamedNative(String nombre) {
		// TODO Auto-generated method stub
		Query miQuery = this.entityManager.createNamedQuery("Cantante.buscarPorNombreNamedNative", Cantante.class);
		miQuery.setParameter("valor", nombre);
		
		return (Cantante) miQuery.getSingleResult();
	}

	@Override
	public Cantante buscarCantantePorNombreCriteriaAPI(String nombre) {
		// TODO Auto-generated method stub
		CriteriaBuilder myCriteria = this.entityManager.getCriteriaBuilder(); 
		CriteriaQuery<Cantante> miQuery = myCriteria.createQuery(Cantante.class);
		
		//select * from tabla where 
		//Aqui empiezo a construir mi SQL
		Root<Cantante> myTable = miQuery.from(Cantante.class);
		
		//los where en criteria API se los conoce como predicados
		//select * from Guardia g where g.apellido=: valor
		Predicate p1 = myCriteria.equal(myTable.get("nombre"), nombre);
		 
		//Empezamos a conformar el select 
		miQuery.select(myTable).where(p1);
		
		TypedQuery<Cantante> typedQuery = this.entityManager.createQuery(miQuery);
		
		return typedQuery.getSingleResult();
	}

}
