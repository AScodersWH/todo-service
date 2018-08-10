package com.thoughtworks.training.tomwang.todoservice.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.thoughtworks.training.tomwang.todoservice.model.Todo;
import com.thoughtworks.training.tomwang.todoservice.utils.SpellChecker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
public class RetryService {
    @Autowired
    public SpellChecker spellChecker;
    @HystrixCommand(fallbackMethod = "checkAllFallback")
    @Retryable(maxAttempts = 2002,backoff = @Backoff(1))
    public List<Todo> checkAll(List<Todo> todos) {
        spellChecker.check(todos,Todo::getText,Todo::setSuggestion);
        return todos;
    }
//    @Recover
//    public List<Todo> recoverAll(RuntimeException e,List<Todo> todos){
//        log.info("recover");
//        return todos;
//    }

    public List<Todo> checkAllFallback(List<Todo> todos){
        log.info("checkAllFallback");
        return todos;

    }

}
