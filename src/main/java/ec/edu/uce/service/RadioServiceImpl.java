package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Radio;
import ec.edu.uce.repository.IRadioRepo;
@Service
public class RadioServiceImpl implements IRadioService{

	@Autowired
	private IRadioRepo radioRepo;
	
	@Override
	public void insertarRadioNuevo(Radio radio) {
		// TODO Auto-generated method stub
		this.radioRepo.insertarRadio(radio);
	}

	@Override
	public void actualizarRadioNuevo(Radio radio) {
		// TODO Auto-generated method stub
		this.radioRepo.actualizarRadio(radio);
	}

	@Override
	public void borrarRadioPorId(Integer id) {
		// TODO Auto-generated method stub
		this.radioRepo.borrarRadio(id);
	}

	@Override
	public Radio buscarRadioPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.radioRepo.buscarRadio(id);
	}


}
