package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Auto;
import ec.edu.uce.repository.jpa.IAutoRepo;

@Service
public class AutoServiceImpl implements IAutoService{
	
	@Autowired
	private IAutoRepo autoRepo;

	@Override
	public void guardarAuto(Auto auto) {
		// TODO Auto-generated method stub
		this.autoRepo.insertarAuto(auto);
	}

}
