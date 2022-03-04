package ec.edu.uce.service.deberes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.deberes.HistoricoRetiros;
import ec.edu.uce.repository.deberes.IHistoricoRetirosRepo;

@Service
public class HistoricoRetirosServiceImpl implements IHistoricoRetirosService {
	
	@Autowired
	private IHistoricoRetirosRepo histRetiroRepo;

	@Override
	public void insertarHistoricoRetiros(HistoricoRetiros historicoRetiros) {
		// TODO Auto-generated method stub
		this.histRetiroRepo.insertarHistoricoRetiros(historicoRetiros);
	}

	@Override
	public void actualizarHistoricoRetiros(HistoricoRetiros historicoRetiros) {
		// TODO Auto-generated method stub
		this.histRetiroRepo.actualizarHistoricoRetiros(historicoRetiros);
	}

	@Override
	public HistoricoRetiros buscarHistoricoRetiros(Integer id) {
		// TODO Auto-generated method stub
		return this.histRetiroRepo.buscarHistoricoRetiros(id);
	}

	@Override
	public void borrarHistoricoRetiros(Integer id) {
		// TODO Auto-generated method stub
		this.histRetiroRepo.borrarHistoricoRetiros(id);
	}

}
