package br.com.fiapsubtest.fiaptodos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiapsubtest.fiaptodos.models.Todo;

public interface TodoRepository  extends JpaRepository<Todo, Long>{
    
}
