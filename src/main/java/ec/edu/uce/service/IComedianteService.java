package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.Comediante;

public interface IComedianteService {
	void guardar(Comediante comediante);
	void actualizar(Comediante comediante);
}
