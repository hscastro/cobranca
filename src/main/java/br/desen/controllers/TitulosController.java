package br.desen.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.desen.models.Titulo;
import br.desen.repository.TitulosRepository;

@Controller
@RequestMapping("/titulos")
public class TitulosController {
	
	@Autowired
	private TitulosRepository titulos;

	@GetMapping("/novo")
	public String novo() {
		return "CadastroTitulo";
	}	
	
	@RequestMapping(method = RequestMethod.POST)
	public String salvar(Titulo titulo) {
		//Todo: salva os titulo no banco de dados
		this.titulos.save(titulo);
		
		return "CadastroTitulo";		
	}
	
}
