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
import ec.edu.uce.modelo.jpa.Celular;

@Repository
@Transactional
public class CelularRepoImpl implements ICelularRepo {

	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarCelular(Celular celular) {
		// TODO Auto-generated method stub
		this.entityManager.persist(celular);
	}

	@Override
	public void actualizarCelular(Celular celular) {
		// TODO Auto-generated method stub
		this.entityManager.merge(celular);
	}

	@Override
	public Celular buscarCelularPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Celular.class, id);
	}

	@Override
	public void borrarCelularPorId(Integer id) {
		// TODO Auto-generated method stub
		Celular celularABorrar = this.buscarCelularPorId(id);
		this.entityManager.remove(celularABorrar);
	}

	@Override
	public Celular buscarCelularPorMarca(String marca) {
		// TODO Auto-generated method stub
		Query miQuery = this.entityManager.createQuery("select g from Celular g where g.marca=: valor");
		miQuery.setParameter("valor", marca);
		Celular miCelular = (Celular) miQuery.getSingleResult();
		//Guardia miGuardia = (Guardia) miQuery.getResultList();
		return miCelular;
	}

	@Override
	public Celular buscarCelularPorMarcaTyped(String marca) {
		// TODO Auto-generated method stub
		TypedQuery<Celular> myTypedQuery =  (TypedQuery<Celular>) this.entityManager.createQuery("select g from Celular g where g.marca=: valor");
		myTypedQuery.setParameter("valor", marca);
		
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Celular buscarCelularPorMarcaNamed(String marca) {
		// TODO Auto-generated method stub
		Query miQuery = this.entityManager.createNamedQuery("Celular.buscarPorMarca");
		miQuery.setParameter("valor", marca);
		return (Celular) miQuery.getSingleResult();
	}

	@Override
	public Celular buscarCelularPorMarcaNative(String marca) {
		// TODO Auto-generated method stub
		Query miQuery = this.entityManager.createNativeQuery("select * from Celular g where g.marca=:valor", Celular.class);
		miQuery.setParameter("valor", marca);
		
		return (Celular) miQuery.getSingleResult();
	}

	@Override
	public Celular buscarCelularPorMarcaNamedNative(String marca) {
		// TODO Auto-generated method stub
		Query miQuery = this.entityManager.createNamedQuery("Celular.buscarPorMarcaNamedNative", Celular.class);
		miQuery.setParameter("valor", marca);
		
		return (Celular) miQuery.getSingleResult();
	}

	@Override
	public Celular buscarCelularPorMarcaCriteriaAPI(String marca) {
		// TODO Auto-generated method stub
		CriteriaBuilder myCriteria = this.entityManager.getCriteriaBuilder(); 
		CriteriaQuery<Celular> miQuery = myCriteria.createQuery(Celular.class);
		
		//select * from tabla where 
		//Aqui empiezo a construir mi SQL
		Root<Celular> myTable = miQuery.from(Celular.class);
		
		//los where en criteria API se los conoce como predicados
		//select * from Guardia g where g.apellido=: valor
		Predicate p1 = myCriteria.equal(myTable.get("marca"), marca);
		 
		//Empezamos a conformar el select 
		miQuery.select(myTable).where(p1);
		
		TypedQuery<Celular> typedQuery = this.entityManager.createQuery(miQuery);
		
		return typedQuery.getSingleResult();
	}

}
