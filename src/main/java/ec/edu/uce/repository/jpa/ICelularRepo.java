package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.Celular;

public interface ICelularRepo {

	void insertarCelular(Celular celular);
	void actualizarCelular(Celular celular);
	Celular buscarCelularPorId(Integer id);
	void borrarCelularPorId(Integer id);
}
