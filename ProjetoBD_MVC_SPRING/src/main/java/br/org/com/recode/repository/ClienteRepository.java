package br.org.com.recode.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.com.recode.model.Cliente;

// É a responsável em fazer os comandos do CRUD (Create, Read, Update e Delete). Faz a função do DAO
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
}