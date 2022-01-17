package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.AlmacenRopa;
import ec.edu.uce.repository.IAlmacenRopaRepo;

@Service
public class AlmacenRopaServiceImpl  implements IAlmacenRopaService{

	@Autowired
	private IAlmacenRopaRepo almacenRepo;
	@Override
	public void insertarRopaNuevo(AlmacenRopa almacenRopa) {
		// TODO Auto-generated method stub
		this.almacenRepo.insertarRopa(almacenRopa);
	}
	@Override
	public void actualizarAlmacenRopaNuevo(AlmacenRopa almacenRopa) {
		// TODO Auto-generated method stub
		this.almacenRepo.actualizarRopa(almacenRopa);
	}
	@Override
	public void borrarAlmacenRopaPorId(Integer id) {
		// TODO Auto-generated method stub
		this.almacenRepo.borrarRopa(id);
		
	}
	@Override
	public AlmacenRopa buscarAlmacenRopaPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.almacenRepo.buscarRopa(id);
	}

}
