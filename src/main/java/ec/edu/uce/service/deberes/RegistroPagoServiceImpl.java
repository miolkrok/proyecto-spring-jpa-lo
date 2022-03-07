package ec.edu.uce.service.deberes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.deberes.RegistroPago;
import ec.edu.uce.repository.deberes.IRegistroPagoRepo;

@Service
public class RegistroPagoServiceImpl implements IRegistroPagoService{
	
	@Autowired
	private IRegistroPagoRepo registroPagoRepo;

	@Override
	public void insertarRegistroPago(RegistroPago registroPago) {
		// TODO Auto-generated method stub
		this.registroPagoRepo.insertarRegistroPago(registroPago);
	}

	@Override
	public void actualizarRegistroPago(RegistroPago registroPago) {
		// TODO Auto-generated method stub
		this.registroPagoRepo.actualizarRegistroPago(registroPago);
	}

	@Override
	public RegistroPago buscarRegistroPago(Integer id) {
		// TODO Auto-generated method stub
		return this.registroPagoRepo.buscarRegistroPago(id);
	}

	@Override
	public void borrarCliente(Integer id) {
		// TODO Auto-generated method stub
		this.registroPagoRepo.borrarCliente(id);
	}

}
