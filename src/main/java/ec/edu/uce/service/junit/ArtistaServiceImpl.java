package ec.edu.uce.service.junit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.junit.Artista;
import ec.edu.uce.repository.junit.IArtistaRepo;



@Service
public class ArtistaServiceImpl implements IArtistaService{

	@Autowired
	private IArtistaRepo artistaRepo;
	
	@Override
	public void guardarArtista(Artista artista) {
		// TODO Auto-generated method stub
		this.artistaRepo.insertarArtista(artista);;
	}

	@Override
	public void modificarArtista(Artista artista) {
		// TODO Auto-generated method stub
		this.artistaRepo.acctualizarArtista(artista);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.artistaRepo.borrarArtista(id);
	}

	@Override
	public Artista buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.artistaRepo.buscarArtista(id);
	}

	@Override
	public Artista buscarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		return this.artistaRepo.buscarPorApellido(apellido);
	}

	@Override
	public Artista buscarPorApellidoTyped(String apellido) {
		// TODO Auto-generated method stub
		return this.artistaRepo.buscarArtistaPorApellidoType(apellido);
	}

	@Override
	public Artista buscarPorApellidoNamed(String apellido) {
		// TODO Auto-generated method stub
		
		return this.artistaRepo.buscarArtistaPorApellidoNamed(apellido);
		
		
	}

	@Override
	public Artista buscarPorApellidoNativeQuery(String apellido) {
		// TODO Auto-generated method stub
		return this.artistaRepo.buscarArtistaPorApellidoNativeQuery(apellido);
	}

	@Override
	public List<Artista> buscarPorApellidoCriteriaApi(String apellido) {
		// TODO Auto-generated method stub
		return this.artistaRepo.buscarPorApellidoCriteriaApi(apellido);
	}

	
}
