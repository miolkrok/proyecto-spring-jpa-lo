package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Comediante;
import ec.edu.uce.repository.jpa.IComedianteRepo;
@Service
public class ComedianteServiceImpl implements IComedianteService{

	@Autowired
	private IComedianteRepo comedianteRepo;
	
	@Override
	public void guardar(Comediante comediante) {
		// TODO Auto-generated method stub
		this.comedianteRepo.insertarComediante(comediante);
	}

	@Override
	public void actualizar(Comediante comediante) {
		// TODO Auto-generated method stub
		this.comedianteRepo.actualizarComediante(comediante);
	}

	@Override
	public Comediante buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.comedianteRepo.buscarComediantePorId(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.comedianteRepo.borrarComediantePorId(id);
		
	}

	@Override
	public Comediante buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.comedianteRepo.buscarComediantePorNombre(nombre);
	}

	@Override
	public Comediante buscarPorNombreTyped(String nombre) {
		// TODO Auto-generated method stub
		return this.comedianteRepo.buscarComediantePorNombreTyped(nombre);
	}

	@Override
	public Comediante buscarPorNombreNamed(String nombre) {
		// TODO Auto-generated method stub
		return this.comedianteRepo.buscarComediantePorNombreNamed(nombre);
	}

}
