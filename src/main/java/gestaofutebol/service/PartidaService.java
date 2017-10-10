package gestaofutebol.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import gestaofutebol.dao.PartidaDao;
import gestaofutebol.model.Campo;
import gestaofutebol.model.Partida;

@Service
@Transactional
public class PartidaService {

	private final PartidaDao partidaDao;
	
	public PartidaService(PartidaDao partidaDao) {
		this.partidaDao = partidaDao;
	}
	
	public List<Partida> findAll(){
		List<Partida> partidas = new ArrayList<Partida>();
		
		for (Partida partida : partidaDao.findAll()) {
			partidas.add(partida);
		}
		
		return partidas;
	}

	
	public Partida findByData(Date data){
		
		return partidaDao.findByData(data);
		
	}
	
	public void save(Partida partida){
		partidaDao.save(partida);
	}
	
}
