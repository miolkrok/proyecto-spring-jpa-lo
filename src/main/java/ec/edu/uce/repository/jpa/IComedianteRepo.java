package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.Comediante;


public interface IComedianteRepo {

	void insertarComediante(Comediante comediante);
	void actualizarComediante(Comediante comediante);
	Comediante buscarComediantePorId(Integer id);
	void borrarComediantePorId(Integer id);
}
