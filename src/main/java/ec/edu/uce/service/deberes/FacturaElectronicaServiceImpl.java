package ec.edu.uce.service.deberes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.deberes.FacturaElectronica;
import ec.edu.uce.repository.deberes.IFacturaElectronicaRepo;

@Service
public class FacturaElectronicaServiceImpl implements IFacturaElectronicaService{

	
	@Autowired
	private IFacturaElectronicaRepo facturaElectronicaRepo;
	
	@Override
	public void insertarFacturaElectronica(FacturaElectronica facturaElectronica) {
		// TODO Auto-generated method stub
		this.facturaElectronicaRepo.insertarFacturaElectronica(facturaElectronica);
	}

	@Override
	public void actualizarFacturaElectronica(FacturaElectronica facturaElectronica) {
		// TODO Auto-generated method stub
		this.facturaElectronicaRepo.actualizarFacturaElectronica(facturaElectronica);
	}

	@Override
	public FacturaElectronica buscarFacturaElectronica(Integer id) {
		// TODO Auto-generated method stub
		return this.facturaElectronicaRepo.buscarFacturaElectronica(id);
	}

	@Override
	public void borrarFacturaElectronica(Integer id) {
		// TODO Auto-generated method stub
		this.facturaElectronicaRepo.borrarFacturaElectronica(id);
	}

}
