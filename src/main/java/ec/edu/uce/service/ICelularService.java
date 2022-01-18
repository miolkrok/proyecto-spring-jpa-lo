package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.Celular;

public interface ICelularService {
	void guardar(Celular celular);
	void actualizar(Celular celular);
}
