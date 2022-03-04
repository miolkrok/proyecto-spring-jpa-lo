package ec.edu.uce.service.deberes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.deberes.CuentaBancariaD;
import ec.edu.uce.modelo.deberes.CuentaHabiente;
import ec.edu.uce.repository.deberes.ICuentaBancariaDRepo;

@Service
public class CuentaBancariaDServiceImpl implements ICuentaBancariaDService{
	
	@Autowired
	private ICuentaBancariaDRepo cuentaBanDRepo;

	@Override
	public void insertarCuentaBancariaD(CuentaBancariaD cuentaBancaria) {
		// TODO Auto-generated method stub
		this.cuentaBanDRepo.insertarCuentaBancariaD(cuentaBancaria);
	}

	@Override
	public void actualizarCuentaBancariaD(CuentaBancariaD cuentaBancaria) {
		// TODO Auto-generated method stub
		this.cuentaBanDRepo.actualizarCuentaBancariaD(cuentaBancaria);
	}

	@Override
	public CuentaBancariaD buscarCuentaBancariaD(Integer id) {
		// TODO Auto-generated method stub
		return this.cuentaBanDRepo.buscarCuentaBancariaD(id);
	}

	@Override
	public void borrarCuentaBancariaD(Integer id) {
		// TODO Auto-generated method stub
		this.cuentaBanDRepo.borrarCuentaBancariaD(id);
	}

	@Override
	public List<CuentaBancariaD> buscarCuentaBancariaDHab(CuentaHabiente cuentaHabiente) {
		// TODO Auto-generated method stub
		return this.cuentaBanDRepo.buscarCuentaBancariaDHab(cuentaHabiente);
	}

	@Override
	public CuentaBancariaD buscarCuentaBancariaDNum(String numeroCuenta) {
		// TODO Auto-generated method stub
		return this.cuentaBanDRepo.buscarCuentaBancariaDNum(numeroCuenta);
	}

}
