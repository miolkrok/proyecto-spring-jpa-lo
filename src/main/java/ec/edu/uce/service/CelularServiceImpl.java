package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Celular;
import ec.edu.uce.repository.jpa.ICelularRepo;
@Service
public class CelularServiceImpl implements ICelularService{

	@Autowired
	private ICelularRepo celularRepo;
	
	@Override
	public void guardar(Celular celular) {
		// TODO Auto-generated method stub
		this.celularRepo.insertarCelular(celular);
	}

	@Override
	public void actualizar(Celular celular) {
		// TODO Auto-generated method stub
		this.celularRepo.actualizarCelular(celular);
	}

	@Override
	public Celular buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.celularRepo.buscarCelularPorId(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.celularRepo.borrarCelularPorId(id);
		
	}

	@Override
	public Celular buscarPorMarca(String marca) {
		// TODO Auto-generated method stub
		return this.celularRepo.buscarCelularPorMarca(marca);
	}

	@Override
	public Celular buscarPorMarcaTyped(String marca) {
		// TODO Auto-generated method stub
		return this.celularRepo.buscarCelularPorMarcaTyped(marca);
	}

	@Override
	public Celular buscarPorMarcaNamed(String marca) {
		// TODO Auto-generated method stub
		return this.celularRepo.buscarCelularPorMarcaNamed(marca);
	}

	@Override
	public Celular buscarPorMarcaNative(String marca) {
		// TODO Auto-generated method stub
		return this.celularRepo.buscarCelularPorMarcaNative(marca);
	}

	@Override
	public Celular buscarPorMarcaNamedNative(String marca) {
		// TODO Auto-generated method stub
		return this.celularRepo.buscarCelularPorMarcaNamedNative(marca);
	}

	@Override
	public Celular buscarPorMarcaCriteriaAPI(String marca) {
		// TODO Auto-generated method stub
		return this.celularRepo.buscarCelularPorMarcaCriteriaAPI(marca);
	}

}
