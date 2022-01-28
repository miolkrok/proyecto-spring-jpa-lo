package ec.edu.uce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Guardia;
import ec.edu.uce.repository.jpa.IGuardiaRepo;
@Service
public class GuardiaServiceImpl implements IGuardiaService {

	@Autowired
	private IGuardiaRepo guardiaRepo;
	
	@Override
	public void guardar(Guardia guardia) {
		// TODO Auto-generated method stub
		this.guardiaRepo.insertarGuardia(guardia);
	}

	@Override
	public void actualizar(Guardia guardia) {
		// TODO Auto-generated method stub
		this.guardiaRepo.actualizarGuardia(guardia);
	}

	@Override
	public Guardia buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.guardiaRepo.buscarGuardiaPorId(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.guardiaRepo.borrarGuardiaPorId(id);
	}

	@Override
	public Guardia buscarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		return this.guardiaRepo.buscarGuardiaPorApellido(apellido);
	}
	
	@Override
	public Guardia buscarPorApellidoTyped(String apellido) {
		// TODO Auto-generated method stub
		return this.guardiaRepo.buscarGuardiaPorApellidoType(apellido);
	}
	
	@Override
	public Guardia buscarPorApellidoNamed(String apellido) {
		// TODO Auto-generated method stub
		return this.guardiaRepo.buscarGuardiaPorApellidoNamed(apellido);
		
	}

	@Override
	public Guardia buscarPorApellidoLista(String apellido) {
		// TODO Auto-generated method stub
		return this.guardiaRepo.buscarGuardiaPorApellidoLista(apellido);
	}

	@Override
	public Guardia buscarPorApellidoNative(String apellido) {
		// TODO Auto-generated method stub
		return this.guardiaRepo.buscarGuardiaPorApellidoNative(apellido);
	}

	@Override
	public Guardia buscarPorApellidoNamedNative(String apellido) {
		// TODO Auto-generated method stub
		return this.guardiaRepo.buscarGuardiaPorApellidoNamedNative(apellido);
	}

	@Override
	public Guardia buscarPorApellidoCriteriaAPI(String apellido) {
		// TODO Auto-generated method stub
		return this.guardiaRepo.buscarGuardiaPorApellidoCriteriaAPI(apellido);
		
	}

	@Override
	public Guardia buscarPorApellidoCriteriaAPIAnd(String apellido , String edificio) {
		// TODO Auto-generated method stub
		return this.guardiaRepo.buscarGuardiaPorApellidoCriteriaAPIAnd(apellido, edificio);
	}

	@Override
	public List<Guardia> buscarPorApellidoCriteriaAPIOr(String apellido, String edificio) {
		// TODO Auto-generated method stub
		return this.guardiaRepo.buscarGuardiaPorApellidoCriteriaAPIOr(apellido, edificio);
		
	}




}
