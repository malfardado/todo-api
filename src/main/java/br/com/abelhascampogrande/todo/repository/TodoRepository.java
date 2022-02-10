package br.com.abelhascampogrande.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.abelhascampogrande.todo.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{

}
