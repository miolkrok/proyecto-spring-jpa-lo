package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.Guardia;

public interface IGuardiaService {
	void guardar(Guardia guardia);
	void actualizar(Guardia guardia);
	Guardia buscar(Integer id);
	void borrar(Integer id);
	Guardia buscarPorApellido(String apellido);
}
