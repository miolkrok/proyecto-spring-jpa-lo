package ec.edu.uce.repository.junit;

import java.util.List;

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

import ec.edu.uce.modelo.junit.Artista;






@Repository
@Transactional
public class ArtistaRepoImpl implements IArtistaRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarArtista(Artista artista) {
		// TODO Auto-generated method stub
		this.entityManager.persist(artista);
	}

	@Override
	public void acctualizarArtista(Artista artista) {
		// TODO Auto-generated method stub
		
		this.entityManager.merge(artista);
	}

	@Override
	public void borrarArtista(Integer id) {
		// TODO Auto-generated method stub
		Artista art = this.buscarArtista(id);

		this.entityManager.remove(art);

	}

	@Override
	public Artista buscarArtista(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Artista.class, id);
	}

	@Override
	public Artista buscarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		Query miQuery = this.entityManager.createQuery("select a from Artista a where a.apellido = :valor");
		miQuery.setParameter("valor", apellido);
		Artista artis = (Artista) miQuery.getSingleResult();
		return artis;
	}

	@Override
	public Artista buscarArtistaPorApellidoType(String apellido) {
		// TODO Auto-generated method stub

		TypedQuery<Artista> miTypedQuery = (TypedQuery<Artista>) this.entityManager
				.createQuery("select a from Artista a where a.apellido = :valor");
		miTypedQuery.setParameter("valor", apellido);

		return miTypedQuery.getSingleResult();
	}

	@Override
	public Artista buscarArtistaPorApellidoNamed(String apellido) {
		Query miQuery = this.entityManager.createNamedQuery("Artista.buscarPorApellido");
		miQuery.setParameter("valor", apellido);
		return (Artista) miQuery.getSingleResult();
	}

	@Override
	public Artista buscarArtistaPorApellidoNativeQuery(String apellido) {
		// TODO Auto-generated method stub
		Query miQuery = this.entityManager.createNativeQuery("select * from artista a where a.apellido = :valor",Artista.class);
		miQuery.setParameter("valor", apellido);
		
		return (Artista) miQuery.getSingleResult();
	}

	@Override
	public List<Artista> buscarPorApellidoCriteriaApi(String apellido) {
		// TODO Auto-generated method stub
		
		CriteriaBuilder miCriteria = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Artista> miQuery = miCriteria.createQuery(Artista.class);
		Root<Artista> miTabla = miQuery.from(Artista.class);
		
		Predicate p1 = miCriteria.equal(miTabla.get("apellido"), apellido);
		
		miQuery.select(miTabla).where(p1);
		
		TypedQuery<Artista> typedQuery = this.entityManager.createQuery(miQuery);
		
		return typedQuery.getResultList();
	}
	
}
