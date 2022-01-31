package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.Celular;

public interface ICelularRepo {

	void insertarCelular(Celular celular);
	void actualizarCelular(Celular celular);
	Celular buscarCelularPorId(Integer id);
	void borrarCelularPorId(Integer id);
	Celular buscarCelularPorMarca(String marca);
	Celular buscarCelularPorMarcaTyped(String marca);
	Celular buscarCelularPorMarcaNamed(String marca);
	Celular buscarCelularPorMarcaNative(String marca);
	Celular buscarCelularPorMarcaNamedNative(String marca);
	Celular buscarCelularPorMarcaCriteriaAPI(String marca);
}
