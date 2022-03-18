package ec.edu.uce.service.deberes;

import ec.edu.uce.modelo.deberes.PolizaSeguro;

public interface IPolizaSeguroService {

	void insertarPolizaSeguro(PolizaSeguro polizaSeguro);
	void actualizarPolizaSeguro(PolizaSeguro polizaSeguro);
	PolizaSeguro buscarPolizaSeguro(Integer id);
	void borrarPolizaSeguro(Integer id);
}
