package ec.edu.uce.service.deberes;

import ec.edu.uce.modelo.deberes.FacturaElectronica;

public interface IFacturaElectronicaService {

	void insertarFacturaElectronica(FacturaElectronica facturaElectronica);
	void actualizarFacturaElectronica(FacturaElectronica facturaElectronica);
	FacturaElectronica buscarFacturaElectronica(Integer id);
	void borrarFacturaElectronica(Integer id);
}
