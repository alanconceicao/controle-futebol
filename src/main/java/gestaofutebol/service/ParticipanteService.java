package gestaofutebol.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import gestaofutebol.dao.ParticipanteDao;
import gestaofutebol.model.Participante;
import gestaofutebol.model.Partida;

@Service
@Transactional
public class ParticipanteService {

	private final ParticipanteDao participanteDao;
	
	public ParticipanteService(ParticipanteDao participanteDao) {
		this.participanteDao = participanteDao;
	}
	
	public void save(Participante participante){
		participanteDao.save(participante);
	}
	
}
