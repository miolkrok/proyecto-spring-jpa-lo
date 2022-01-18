package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.Cantante;

public interface ICantanteService {
	void guardar(Cantante cantante);
	void actualizar(Cantante cantante);
}
