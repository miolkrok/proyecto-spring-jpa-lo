package ec.edu.uce.repository.deberes;

import ec.edu.uce.modelo.deberes.PolizaSeguro;

public interface IPolizaSeguroRepo {
	
	void insertarPolizaSeguro(PolizaSeguro polizaSeguro);
	void actualizarPolizaSeguro(PolizaSeguro polizaSeguro);
	PolizaSeguro buscarPolizaSeguro(Integer id);
	void borrarPolizaSeguro(Integer id);

}
