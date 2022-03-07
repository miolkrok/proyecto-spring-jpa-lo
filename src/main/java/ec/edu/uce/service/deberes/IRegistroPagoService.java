package ec.edu.uce.service.deberes;

import ec.edu.uce.modelo.deberes.RegistroPago;

public interface IRegistroPagoService {

	void insertarRegistroPago(RegistroPago registroPago);
	void actualizarRegistroPago(RegistroPago registroPago);
	RegistroPago buscarRegistroPago(Integer id);
	void borrarCliente(Integer id);
}
