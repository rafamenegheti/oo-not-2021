package fatecfranca.edu.br.model.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import fatecfranca.edu.br.model.Paciente;

// uma classe do tipo interface tem somente
// declaração de metodos;
// a classe vai herdar a classe MongoRepository
// com essa herença, reremos todos os metodos de CRUD 
// do baco de dados especificos da classe Paciente
// String é o tipo da chave da classe paciente
public interface PacienteRepository extends MongoRepository<Paciente, String> {

	// esta interface vai herdae e conter:
	// metodo save() para inserir e atualizar no banco de dados
	// metodo findAll() para consultar
	// metodo remove() para remover
	
}
