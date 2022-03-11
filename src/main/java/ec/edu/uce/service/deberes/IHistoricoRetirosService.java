package ec.edu.uce.service.deberes;

import java.util.List;

import ec.edu.uce.modelo.deberes.HistoricoRetiros;

public interface IHistoricoRetirosService {
	
	void insertarHistoricoRetiros(HistoricoRetiros historicoRetiros);
	void actualizarHistoricoRetiros(HistoricoRetiros historicoRetiros);
	HistoricoRetiros buscarHistoricoRetiros(Integer id);
	void borrarHistoricoRetiros(Integer id);
	List<HistoricoRetiros> buscarReporteHistoricoRetiros();
	

}
