package ec.edu.uce.service;

import ec.edu.uce.modelo.Estudiante;


public interface IEstudianteService {
	void insertarEstudianteNuevo(Estudiante estudiante);
	void actualizarEstudianteNuevo(Estudiante estudiante);
	void borrarEstudiantePorId(Integer id);
	Estudiante buscarEstudiantePorId(Integer id);
}
