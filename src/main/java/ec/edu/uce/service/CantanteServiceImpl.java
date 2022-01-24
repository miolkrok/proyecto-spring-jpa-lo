package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Cantante;
import ec.edu.uce.repository.jpa.ICantanteRepo;
@Service
public class CantanteServiceImpl implements ICantanteService{
	
	@Autowired
	private ICantanteRepo cantanteRepo;

	@Override
	public void guardar(Cantante cantante) {
		// TODO Auto-generated method stub
		this.cantanteRepo.insertarCantante(cantante);
	}

	@Override
	public void actualizar(Cantante cantante) {
		// TODO Auto-generated method stub
		this.cantanteRepo.actualizarCantante(cantante);
	}

	@Override
	public Cantante buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.cantanteRepo.buscarCantantePorId(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.cantanteRepo.borrarCantantePorId(id);
	}

	@Override
	public Cantante buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.cantanteRepo.buscarCantantePorNombre(nombre);
	}

	@Override
	public Cantante buscarPorNombreTyped(String nombre) {
		// TODO Auto-generated method stub
		return this.cantanteRepo.buscarCantantePorNombreTyped(nombre);
	}

	@Override
	public Cantante buscarPorNombreNamed(String nombre) {
		// TODO Auto-generated method stub
		return this.cantanteRepo.buscarCantantePorNombreNamed(nombre)
				;
	}

}
