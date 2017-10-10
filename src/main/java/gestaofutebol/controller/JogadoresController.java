package gestaofutebol.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import gestaofutebol.model.Jogador;
import gestaofutebol.service.JogadorService;

@Controller
@EnableAutoConfiguration
@RequestMapping("/jogadores/")
public class JogadoresController {

	
	@Autowired
	private JogadorService jogadorService;	
	
	@GetMapping("listar")
	public ModelAndView listar(){
		ModelAndView modelAndView = new ModelAndView("jogadores");
		
		modelAndView.addObject("jogadores", jogadorService.findAll());
		modelAndView.addObject("mode", "Listar");
		
		return modelAndView;
	}
		
	@PostMapping("salvar")
	public ModelAndView salvar(@ModelAttribute Jogador jogador, BindingResult bindingResult){
		ModelAndView modelAndView = new ModelAndView("jogadores");
		
		jogadorService.save(jogador);
		
		modelAndView.addObject("jogadores", jogadorService.findAll());
		modelAndView.addObject("mensagem", "Jogador gravado");
		modelAndView.addObject("mode", "Listar");
		
		return modelAndView;
	}
	
	@GetMapping("novo")
	public ModelAndView novo(){
		ModelAndView modelAndView = new ModelAndView("jogadores");
		modelAndView.addObject("mode", "Novo");
		return modelAndView;
	}
	
	@GetMapping("atualizar")
	public ModelAndView atualizar(@RequestParam int id){
		ModelAndView modelAndView = new ModelAndView("jogadores");
		modelAndView.addObject("jogador", jogadorService.findById(id));
		modelAndView.addObject("mode", "Atualizar");
		return modelAndView;
	}
	
	@GetMapping("deletar")
	public ModelAndView deletar(@RequestParam int id){
		ModelAndView modelAndView = new ModelAndView("jogadores");
		
		jogadorService.delete(id);
		
		modelAndView.addObject("jogadores", jogadorService.findAll());
		modelAndView.addObject("mensagem", "Jogador excluído");
		modelAndView.addObject("mode", "Listar");
		
		return modelAndView;
	}
	
}
