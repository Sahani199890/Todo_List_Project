package com.example.todo.service;


import com.example.todo.model.Todo;
import com.example.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public void addTodo(Todo todo){
        todoRepository.save(todo);
    }

    public void updateTodo(int id,Todo newTodo) {

        Todo todo=findById(id);
        todo.setId(newTodo.getId());
        todo.setTitle(newTodo.getTitle());
        todo.setStatus(newTodo.isStatus());
        todoRepository.save(todo);
    }

    public Todo findById(int id) {
        return todoRepository.findById(id).get();
    }

    public List<Todo> findAll() {
        return todoRepository.findAll();
    }

    public void deleteTodo(int id) {
        todoRepository.deleteById(id);
    }
}



















// return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//return new ResponseEntity<>(todoService.getTodoById(todoId), HttpStatus.OK);
//return new ResponseEntity<>(todo, HttpStatus.CREATED);
/*

{
    "id":100,
    "title": "Buy eggs from supermarket",
    "status": false
}

Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        Todo todo = todos.stream().filter(predicate).findFirst().get();
        return todo;

Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        todos.removeIf(predicate);

 */