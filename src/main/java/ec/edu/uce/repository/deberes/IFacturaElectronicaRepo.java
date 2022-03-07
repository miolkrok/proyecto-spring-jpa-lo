package ec.edu.uce.repository.deberes;

import ec.edu.uce.modelo.deberes.FacturaElectronica;

public interface IFacturaElectronicaRepo {
	
	void insertarFacturaElectronica(FacturaElectronica facturaElectronica);
	void actualizarFacturaElectronica(FacturaElectronica facturaElectronica);
	FacturaElectronica buscarFacturaElectronica(Integer id);
	void borrarFacturaElectronica(Integer id);

}
