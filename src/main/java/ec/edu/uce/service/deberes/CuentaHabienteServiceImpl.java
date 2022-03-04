package ec.edu.uce.service.deberes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.deberes.CuentaHabiente;
import ec.edu.uce.repository.deberes.ICuentaHabienteRepo;

@Service
public class CuentaHabienteServiceImpl implements ICuentaHabienteService{
	
	@Autowired
	private ICuentaHabienteRepo cuentaHabRepo;

	@Override
	public void insertarCuentaHabiente(CuentaHabiente cuentaHabiente) {
		// TODO Auto-generated method stub
		this.cuentaHabRepo.insertarCuentaHabiente(cuentaHabiente);
	}

	@Override
	public void actualizarCuentaHabiente(CuentaHabiente cuentaHabiente) {
		// TODO Auto-generated method stub
		this.cuentaHabRepo.actualizarCuentaHabiente(cuentaHabiente);
	}

	@Override
	public CuentaHabiente buscarCuentaHabiente(Integer id) {
		// TODO Auto-generated method stub
		return this.cuentaHabRepo.buscarCuentaHabiente(id);
	}

	@Override
	public void borrarCuentaHabiente(Integer id) {
		// TODO Auto-generated method stub
		this.cuentaHabRepo.borrarCuentaHabiente(id);
	}

	@Override
	public CuentaHabiente buscarCuentaHabienteCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.cuentaHabRepo.buscarCuentaHabienteCedula(cedula);
	}

}
