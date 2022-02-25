package ec.edu.uce.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Consumo;
import ec.edu.uce.repository.jpa.IConsumoRepo;
@Service
public class ConsumoServiceImpl implements IConsumoService{
	
	@Autowired
	private IConsumoRepo consumoRepo;

	@Override
	@Transactional
	public void insertarConsumo(Consumo consumo) {
		// TODO Auto-generated method stub
		this.consumoRepo.insertarConsumo(consumo);
	}

	@Override
	@Transactional
	public void actualizarConsumo(Consumo consumo) {
		// TODO Auto-generated method stub
		this.consumoRepo.actualizarConsumo(consumo);
	}

}
