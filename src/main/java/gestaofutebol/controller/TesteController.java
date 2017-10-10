package gestaofutebol.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import gestaofutebol.model.Campo;
import gestaofutebol.model.Jogador;
import gestaofutebol.model.Participante;
import gestaofutebol.model.Partida;
import gestaofutebol.service.CampoService;
import gestaofutebol.service.JogadorService;
import gestaofutebol.service.ParticipanteService;
import gestaofutebol.service.PartidaService;

@RestController
public class TesteController {

	@Autowired
	private JogadorService jogadorService;
	@Autowired
	private CampoService campoService;
	@Autowired
	private PartidaService partidaService;
	@Autowired
	private ParticipanteService participanteService;
	
	@GetMapping("/teste")
	public String teste(){
Campo campo = new Campo("Campo da Igreja Semear", 470.00, 90);
		
	    Partida partida = new Partida(Calendar.getInstance().getTime(), 0.00, "");

	    partidaService.save(partida);
	    
	    List<Partida> partidas = new ArrayList<Partida>();
	    partidas.add(partida);
	    
	    Jogador jogador = new Jogador("Teste", "Mensalista");
	    Jogador jogador2 = new Jogador("Teste2", "Avulso");
	    Jogador jogador3 = new Jogador("Teste3", "Mensalista");
	    
	    jogadorService.save(jogador);
	    jogadorService.save(jogador2);
	    jogadorService.save(jogador3);
	    
	    Participante participante = new Participante(jogador, 35.00, "Pagou em dinheiro");
	    Participante participante2 = new Participante(jogador2, 10.00, "Pagou em dinheiro");
	    Participante participante3 = new Participante(jogador3, 0.00, "Não pagou");
	    
	    participanteService.save(participante);
	    participanteService.save(participante2);
	    participanteService.save(participante3);
	    
	    List<Participante> participantes = new ArrayList<Participante>();

	    participantes.add(participante);
	    participantes.add(participante2);
	    participantes.add(participante3);
	    
	    partida.setParticipantes(participantes);
	    
	    campo.setPartidas(partidas);
	    
	    campoService.save(campo);
	    
	    return campoService.findAll().get(0).toString();
	}

}
