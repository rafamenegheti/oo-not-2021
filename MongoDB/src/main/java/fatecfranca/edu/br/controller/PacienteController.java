package fatecfranca.edu.br.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import fatecfranca.edu.br.model.Paciente;
import fatecfranca.edu.br.model.repositories.PacienteRepository;

//classe responsavel por responder as requisições restful
//essa API permite o cliente acessar meu banco de dados MongoDB
public class PacienteController {
	
	// Spring tem como recurso principal a injeção
	// de dependencia, permite declarar um objeto do
	// tipo de uma classe interface e esse objeto pode utilizar
	// os metodos da interface sem perciar instancia-la
	
	@Autowired
	PacienteRepository injecao; 
	
	
	@GetMapping("/paciente")
	public List<Paciente> get() {
		return injecao.findAll();
	}
	
	
	@PostMapping("/paciente")
	public String post(@RequestBody Paciente paciente) {
		injecao.save(paciente);
		
		return "Paciente inserido com sucesso";
	}
		

}
