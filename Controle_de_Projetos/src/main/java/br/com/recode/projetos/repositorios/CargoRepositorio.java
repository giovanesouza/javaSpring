package br.com.recode.projetos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.recode.projetos.entidades.Cargo;

public interface CargoRepositorio extends JpaRepository<Cargo, Long> {
    
}
