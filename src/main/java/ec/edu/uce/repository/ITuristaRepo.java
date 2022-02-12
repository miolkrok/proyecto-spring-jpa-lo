package ec.edu.uce.repository;

import java.util.List;

import ec.edu.uce.modelo.Turista;

public interface ITuristaRepo {
	
	void insertarTurista(Turista turista);
	List<Turista> obtenerTodosTuristas(String nombre);

}
