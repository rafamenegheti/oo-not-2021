package fatecfranca.edu.br.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fatecfranca.edu.br.model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long>{
	

}
