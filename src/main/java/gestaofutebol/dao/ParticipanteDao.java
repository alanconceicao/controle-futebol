package gestaofutebol.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import gestaofutebol.model.Jogador;
import gestaofutebol.model.Participante;

public interface ParticipanteDao extends CrudRepository<Participante, Long>{

	List<Participante> findByJogador(Jogador jogador);

}
