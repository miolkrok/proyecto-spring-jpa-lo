package ec.edu.uce.repository.deberes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.deberes.CuentaBancariaD;
import ec.edu.uce.modelo.deberes.CuentaHabiente;


@Repository
@Transactional
public class CuentaBancariaDRepoImpl implements ICuentaBancariaDRepo{
	
	private static final Logger LOG =  LoggerFactory.getLogger(CuentaBancariaDRepoImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarCuentaBancariaD(CuentaBancariaD cuentaBancaria) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cuentaBancaria);
	}

	@Override
	public void actualizarCuentaBancariaD(CuentaBancariaD cuentaBancaria) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cuentaBancaria);
	}

	@Override
	public CuentaBancariaD buscarCuentaBancariaD(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(CuentaBancariaD.class, id);
	}

	@Override
	public void borrarCuentaBancariaD(Integer id) {
		// TODO Auto-generated method stub
		CuentaBancariaD cuentaABorrar = this.buscarCuentaBancariaD(id);
		this.entityManager.remove(cuentaABorrar);
	}

	@Override
	public List<CuentaBancariaD> buscarCuentaBancariaDHab(CuentaHabiente cuentaHabiente) {
		// TODO Auto-generated method stub
		TypedQuery<CuentaBancariaD> myQuery =
				this.entityManager
				.createQuery("SELECT c FROM CuentaBancariaD c WHERE c.cuentaHabienteBanc=:valor",CuentaBancariaD.class);
		myQuery.setParameter("valor", cuentaHabiente);
		
		List<CuentaBancariaD> milistaBanc= myQuery.getResultList();
	
		
		LOG.info("LONGITUD Repo:" + milistaBanc.size());
		for(CuentaBancariaD f : milistaBanc) {
			LOG.info("detalles: " + f.getCuentaHabienteBanc());//Obtenemos bajo demanda
			LOG.info(f.toString());
		}
		return milistaBanc;
	}

	@Override
	public CuentaBancariaD buscarCuentaBancariaDNum(String numeroCuenta) {
		// TODO Auto-generated method stub
		TypedQuery<CuentaBancariaD> myQuery = 
				this.entityManager
				.createQuery("SELECT c FROM CuentaBancariaD c WHERE c.numeroCuenta=:valor",CuentaBancariaD.class);
		myQuery.setParameter("valor", numeroCuenta);
		
		return myQuery.getSingleResult();
	}


}
