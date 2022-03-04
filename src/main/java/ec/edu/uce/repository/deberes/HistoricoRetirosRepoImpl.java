package ec.edu.uce.repository.deberes;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.deberes.HistoricoRetiros;

@Repository
@Transactional
public class HistoricoRetirosRepoImpl implements IHistoricoRetirosRepo{
	
	private static final Logger LOG =  LoggerFactory.getLogger(HistoricoRetirosRepoImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarHistoricoRetiros(HistoricoRetiros historicoRetiros) {
		// TODO Auto-generated method stub
		this.entityManager.persist(historicoRetiros);
	}

	@Override
	public void actualizarHistoricoRetiros(HistoricoRetiros historicoRetiros) {
		// TODO Auto-generated method stub
		this.entityManager.merge(historicoRetiros);
	}

	@Override
	public HistoricoRetiros buscarHistoricoRetiros(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(HistoricoRetiros.class, id);
	}

	@Override
	public void borrarHistoricoRetiros(Integer id) {
		// TODO Auto-generated method stub
		HistoricoRetiros cuentaABorrar = this.buscarHistoricoRetiros(id);
		this.entityManager.remove(cuentaABorrar);
	}

}
