package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.TarjetaCredito;
import ec.edu.uce.repository.jpa.ITarjetaCreditoRepo;

@Service
public class TarjetaCreditoServiceImpl implements ITarjetaCreditoService {

	@Autowired
	private ITarjetaCreditoRepo tarjetaRepo;
	
	@Override
	public void insertarTarjetaCredito(TarjetaCredito tarjetaCredito) {
		// TODO Auto-generated method stub
		this.tarjetaRepo.insertarTarjetaCredito(tarjetaCredito);
	}

	@Override
	public void actualizarTarjetaCredito(TarjetaCredito tarjetaCredito) {
		// TODO Auto-generated method stub
		this.tarjetaRepo.actualizarTarjetaCredito(tarjetaCredito);
	}

	@Override
	public TarjetaCredito buscarTarjetaCredito(Integer id) {
		// TODO Auto-generated method stub
		return this.tarjetaRepo.BuscarPorId(id);
	}



}
