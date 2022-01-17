package ec.edu.uce.service;



import ec.edu.uce.modelo.Profesor;

public interface IProfesorService {
	void insertarProfesorNuevo(Profesor profesor);
	void actualizarProfesorNuevo(Profesor profesor);
	void borrarProfesorPorId(Integer id);
	Profesor busarProfesorPorId(Integer id);
}
