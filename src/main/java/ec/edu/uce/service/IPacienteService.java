package ec.edu.uce.service;

import ec.edu.uce.modelo.Paciente;

public interface IPacienteService {
	
	void guardarPacienteNuevo(Paciente paciente);
	void actualizarPacienteNuevo(Paciente paciente);
	void borrarPacientePorId(Integer id);
	Paciente busarPacientePorId(Integer id);

}
