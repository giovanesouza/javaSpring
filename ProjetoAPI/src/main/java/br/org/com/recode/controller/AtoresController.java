package br.org.com.recode.controller;

// IMPORT PARA EXIBIR A LISTA
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// IMPORTAÇÃO DO MODEL
import br.org.com.recode.model.Ator;
// IMPORTAÇÃO DO REPOSITORY = RESPONSÁVEL PELO CRUD
import br.org.com.recode.repository.AtorRepository;

@RestController
@RequestMapping("api/atores")
public class AtoresController {

	// OBJETO DA CLASSE >> AtorRepository = Nome da Classe. || atorRepository = Nome
	// objeto.

	@Autowired
	private AtorRepository atorRepository;

	// LISTA TODOS OS CADASTROS DA API
	@GetMapping
	public List<Ator> listar() {
		return atorRepository.findAll();
	}

	// BUSCA UM CADASTRO VIA ID >> api/atores/ID
	@GetMapping("/{id}")
	public Ator listarPorId(@PathVariable Long id) {

		return atorRepository.findById(id).get();

	}

	// INSERE DADOS
	@PostMapping
	public Ator adicionar(@RequestBody Ator ator) {
		return atorRepository.save(ator);
	}

	// EXCLUI UM CADASTRO VIA ID >> api/atores/ID
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {

		atorRepository.deleteById(id);

	}
	
	// PEGA O OBJETO QUE VEIO VIA PARÂMETRO (POR REQUISIÇÃO)
	// "Ator" é o dado do Banco e "ator" é o que será usado para setar os valores.
	@PutMapping("/{id}")
	public Ator atualiza(@RequestBody Ator ator, @PathVariable Long id) {

	Ator atorAtualizado = atorRepository.findById(id).get();
	atorAtualizado.setPrimeiro_nome(ator.getPrimeiro_nome());
	atorAtualizado.setUltimo_nome(ator.getUltimo_nome());

	return atorRepository.save(atorAtualizado);

	}


	
	
}
