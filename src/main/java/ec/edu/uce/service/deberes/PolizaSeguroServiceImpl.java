package ec.edu.uce.service.deberes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.deberes.PolizaSeguro;
import ec.edu.uce.repository.deberes.IPolizaSeguroRepo;

@Service
public class PolizaSeguroServiceImpl implements IPolizaSeguroService{

	@Autowired
	private IPolizaSeguroRepo polizaSeguroRepo;
	
	
	@Override
	public void insertarPolizaSeguro(PolizaSeguro polizaSeguro) {
		// TODO Auto-generated method stub
		this.polizaSeguroRepo.insertarPolizaSeguro(polizaSeguro);
		
	}

	@Override
	public void actualizarPolizaSeguro(PolizaSeguro polizaSeguro) {
		// TODO Auto-generated method stub
		this.polizaSeguroRepo.actualizarPolizaSeguro(polizaSeguro);
	}

	@Override
	public PolizaSeguro buscarPolizaSeguro(Integer id) {
		// TODO Auto-generated method stub
		return this.polizaSeguroRepo.buscarPolizaSeguro(id);
	}

	@Override
	public void borrarPolizaSeguro(Integer id) {
		// TODO Auto-generated method stub
		this.polizaSeguroRepo.borrarPolizaSeguro(id);
	}

}
