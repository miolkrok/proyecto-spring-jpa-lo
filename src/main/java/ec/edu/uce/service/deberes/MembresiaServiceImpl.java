package ec.edu.uce.service.deberes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.deberes.Membresia;
import ec.edu.uce.repository.deberes.IMembresiaRepo;

@Service
public class MembresiaServiceImpl implements IMembresiaService{
	
	@Autowired
	private IMembresiaRepo membresiaRepo;

	@Override
	public void insertarMembresia(Membresia membresia) {
		// TODO Auto-generated method stub
		this.membresiaRepo.insertarMembresia(membresia);
	}

	@Override
	public void actualizarMembresia(Membresia membresia) {
		// TODO Auto-generated method stub
		this.membresiaRepo.actualizarMembresia(membresia);
	}

	@Override
	public Membresia buscarMembresia(Integer id) {
		// TODO Auto-generated method stub
		return this.membresiaRepo.buscarMembresia(id);
	}

	@Override
	public void borrarCliente(Integer id) {
		// TODO Auto-generated method stub
		this.membresiaRepo.borrarCliente(id);
	}

	@Override
	public Membresia buscarMembresia(String codigo) {
		// TODO Auto-generated method stub
		return this.membresiaRepo.buscarMembresia(codigo);
	}

}
