package gestaofutebol.dao;

import java.util.Date;

import org.springframework.data.repository.CrudRepository;

import gestaofutebol.model.Partida;

public interface PartidaDao extends CrudRepository<Partida, Long> {

	Partida findByData(Date data);

	
}
