package com.thoughtworks.training.tomwang.todoservice.repository;

import com.thoughtworks.training.tomwang.todoservice.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo,Integer> {
    Todo findFirstById(int id);
}
