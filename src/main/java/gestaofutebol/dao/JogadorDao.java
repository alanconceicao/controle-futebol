package gestaofutebol.dao;

import org.springframework.data.repository.CrudRepository;

import gestaofutebol.model.Jogador;

public interface JogadorDao extends CrudRepository<Jogador, Integer> {

}
