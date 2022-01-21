package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.Comediante;
import ec.edu.uce.modelo.jpa.Guardia;

public interface IComedianteService {
	void guardar(Comediante comediante);
	void actualizar(Comediante comediante);
	Comediante buscar(Integer id);
	void borrar(Integer id);
	Comediante buscarPorNombre(String nombre);
}
