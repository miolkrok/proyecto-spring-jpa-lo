package ec.edu.uce.repository.deberes;

import java.util.List;

import ec.edu.uce.modelo.deberes.HistoricoRetiros;

public interface IHistoricoRetirosRepo {

	void insertarHistoricoRetiros(HistoricoRetiros historicoRetiros);
	void actualizarHistoricoRetiros(HistoricoRetiros historicoRetiros);
	HistoricoRetiros buscarHistoricoRetiros(Integer id);
	void borrarHistoricoRetiros(Integer id);
	List<HistoricoRetiros> buscarReporteHistoricoRetiros();
}
