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


}
