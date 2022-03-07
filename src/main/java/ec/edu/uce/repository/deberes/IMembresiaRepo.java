package ec.edu.uce.repository.deberes;

import ec.edu.uce.modelo.deberes.Membresia;

public interface IMembresiaRepo {
	
	void insertarMembresia(Membresia membresia);
	void actualizarMembresia(Membresia membresia);
	Membresia buscarMembresia(Integer id);
	void borrarCliente(Integer id);
	Membresia buscarMembresia(String codigo);

}
