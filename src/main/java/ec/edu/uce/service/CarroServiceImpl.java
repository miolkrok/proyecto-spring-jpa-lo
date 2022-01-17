package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Carro;
import ec.edu.uce.repository.ICarroRepo;
@Service
public class CarroServiceImpl implements ICarroService {

	@Autowired
	private ICarroRepo carroRepo;
	@Override
	public void insertarCarroNuevo(Carro carro) {
		// TODO Auto-generated method stub
		this.carroRepo.insertarCarro(carro);
	}
	@Override
	public void actualizarCarroNuevo(Carro carro) {
		// TODO Auto-generated method stub
		this.carroRepo.actualizarCarro(carro);
	}
	@Override
	public void borrarCarroPorId(Integer id) {
		// TODO Auto-generated method stub
		this.carroRepo.borrarCarro(id);
	}
	@Override
	public Carro buscarCarroPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.carroRepo.buscarCarro(id);
	}



}
