package br.org.com.recode.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.com.recode.model.Ator;

// RESPONSÁVEL EM FAZER OS COMANDOS DO CRUD (CREATE, READ, UPDATE E DELETE). FAZ A FUNÇÃO DO DAO
public interface AtorRepository extends JpaRepository<Ator, Long>{

}
