package ec.edu.uce.repository.deberes;

import ec.edu.uce.modelo.deberes.RegistroPago;

public interface IRegistroPagoRepo {

	void insertarRegistroPago(RegistroPago registroPago);
	void actualizarRegistroPago(RegistroPago registroPago);
	RegistroPago buscarRegistroPago(Integer id);
	void borrarCliente(Integer id);
}
