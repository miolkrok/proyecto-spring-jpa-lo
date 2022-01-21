package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

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

}
