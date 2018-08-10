package com.thoughtworks.training.tomwang.todoservice.controller;

import com.thoughtworks.training.tomwang.todoservice.model.Todo;
import com.thoughtworks.training.tomwang.todoservice.repository.TodoRepository;
import com.thoughtworks.training.tomwang.todoservice.service.TodoService;
import com.thoughtworks.training.tomwang.todoservice.utils.SpellChecker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoApi {





    @Autowired
    private TodoService todoService;

    @PostMapping("/todos")
    public  void create(@RequestBody Todo todo)
    {
        todoService.createTable(todo);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/todos")
    public List<Todo> listTodos() {

        return todoService.listTodos();
    }



    @RequestMapping(method = RequestMethod.GET, path = "/todos/{id}")
    public Todo find(Integer id) {

        return todoService.find(id);
    }
    @RequestMapping(method = RequestMethod.DELETE, path = "/todos/{id}")
    public void deleteTables(@PathVariable int id) {
        todoService.deleteTable(id);
    }
}
