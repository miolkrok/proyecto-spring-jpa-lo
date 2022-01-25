package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.Celular;

public interface ICelularService {
	void guardar(Celular celular);
	void actualizar(Celular celular);
	Celular buscar(Integer id);
	void borrar(Integer id);
	Celular buscarPorMarca(String marca);
	Celular buscarPorMarcaTyped(String marca);
	Celular buscarPorMarcaNamed(String marca);
	Celular buscarPorMarcaNative(String marca);
}
