package fatecfranca.edu.br.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MensagemController {

	@GetMapping("/mensagem/dia/{nome}")
	public String bomDia(@PathVariable String nome) {
		return "Bom dia " + nome;
	}
	
	
	@GetMapping("/mensagem/tarde")
	public String boaTarde() {
		return "Boa tarde";
	}
	
	@GetMapping("/mensagem/noite")
	public String boaNoite() {
		return "boa noite";
	}
}
