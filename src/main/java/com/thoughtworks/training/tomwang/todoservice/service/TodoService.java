package com.thoughtworks.training.tomwang.todoservice.service;

import com.thoughtworks.training.tomwang.todoservice.model.Todo;
import com.thoughtworks.training.tomwang.todoservice.repository.TodoRepository;
import com.thoughtworks.training.tomwang.todoservice.utils.SpellChecker;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;
@Slf4j
@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;
    @Autowired
    public SpellChecker spellChecker;
    @Autowired
    private RetryService retryService;
    public List<Todo> listTodos() {
        List<Todo> todos = retryService.checkAll(todoRepository.findAll());
        return todos;
    }



    public Todo find(Integer id){
        Todo tables = todoRepository.findOne(id);
        return tables;
    }

    public boolean verify(int id){
        Todo todo = todoRepository.findFirstById(id);
        return todo.isVisible();
    }


    public void createTable(Todo todo) {
        todoRepository.save(todo);
    }
    public void deleteTable(Integer id) {
        todoRepository.delete(id);
    }


    public boolean verifyToken(String token){
        Claims body = Jwts.parser().setSigningKey("kitty".getBytes())
                .parseClaimsJws(token)
                .getBody();
        int id = (int) body.get("name");
        String username = (String) body.get("name");
        return verify(id);

    }

}
