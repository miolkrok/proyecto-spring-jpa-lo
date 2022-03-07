package ec.edu.uce.service.deberes;

import ec.edu.uce.modelo.deberes.Membresia;

public interface IMembresiaService {

	void insertarMembresia(Membresia membresia);
	void actualizarMembresia(Membresia membresia);
	Membresia buscarMembresia(Integer id);
	void borrarCliente(Integer id);
	Membresia buscarMembresia(String codigo);
}
