package ec.edu.uce.service;

import ec.edu.uce.modelo.Materia;


public interface IMateriaService {
	void insertarMateriaNuevo(Materia materia);
	void actualizarMateriaNuevo(Materia materia);
	void borrarMateriaPorId(Integer id);
	Materia buscarMateriaPorId(Integer id);
}
