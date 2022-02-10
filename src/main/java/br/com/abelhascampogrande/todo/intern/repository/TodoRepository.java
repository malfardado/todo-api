package br.com.abelhascampogrande.todo.intern.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.abelhascampogrande.todo.intern.model.Todo;
import org.springframework.stereotype.Repository;


public interface TodoRepository extends JpaRepository<Todo, Long> {

}
