package gestaofutebol.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;


import gestaofutebol.dao.JogadorDao;
import gestaofutebol.model.Jogador;

@Service
@Transactional
public class JogadorService {

	private final JogadorDao jogadorDao;

	public JogadorService(JogadorDao jogadorDao) {
		this.jogadorDao = jogadorDao;
	}
	
	public List<Jogador> findAll(){
		List<Jogador> jogadores = new ArrayList<Jogador>();
		
		for (Jogador jogador : jogadorDao.findAll()) {
			jogadores.add(jogador);
		}		
		
		return jogadores;
	}
	
	public void save(Jogador jogador){
		jogadorDao.save(jogador);
	}
	
	public void delete(int id){
		jogadorDao.delete(id);
	}

	public Jogador findById(int id) {
		return jogadorDao.findOne(id);
	}
	
	
}
