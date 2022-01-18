package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.Cantante;

public interface ICantanteRepo {

	void insertarCantante(Cantante cantante);
	void actualizarCantante(Cantante cantante);
	Cantante buscarCantantePorId(Integer id);
	void borrarCantantePorId(Integer id);
}
