package fatecfranca.edu.br.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fatecfranca.edu.br.model.Paciente;
import fatecfranca.edu.br.model.repositories.PacienteRepository;

@RestController
@RequestMapping("/paciente")
public class PacienteController {
	
	@Autowired
	PacienteRepository injecao;
	
	
	@PostMapping
	@CrossOrigin(origins="*")
	public String add(@RequestBody Paciente paciente) {
		injecao.save(paciente);
		return "Paciente inserido com sucesso";
	}
	
	@GetMapping
	@CrossOrigin(origins="*")
	public List<Paciente> get() {
		return injecao.findAll();
	}
	
	@DeleteMapping("/{id}")
	@CrossOrigin(origins="*")
	public String remove(@PathVariable Long id) {
		injecao.deleteById(id);
		return "Paciente removido com sucesso";
	}
	
	@PutMapping
	@CrossOrigin(origins="*")
	public String update(@RequestBody Paciente paciente) {
		injecao.save(paciente);
		return "Paciente atualziado com sucesso";
	}
}
