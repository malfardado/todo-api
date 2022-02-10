package br.com.abelhascampogrande.todo.intern.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import br.com.abelhascampogrande.todo.intern.model.Todo;
import br.com.abelhascampogrande.todo.intern.repository.TodoRepository;

@Component
public class TodoService {
	
	@Autowired
	private TodoRepository todoRepository;
	
	public void criaTodo() {
		Todo todo = new Todo();
		todo.setDescription("Estudar Spring");
		todo.setCreatedDate(LocalDateTime.now());
		todoRepository.save(todo);
	}

}
