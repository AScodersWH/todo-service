//package com.thoughtworks.training.tomwang.todoservice.repository;
//
//import com.thoughtworks.training.tomwang.todoservice.model.User;
//import com.thoughtworks.training.tomwang.todoservice.service.UserService;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.Optional;
//
//import static org.hamcrest.Matchers.is;
//import static org.junit.Assert.*;
//@DataJpaTest
//@RunWith(SpringRunner.class)
//public class UsersRepositoryTest {
//    @Autowired
//    private UsersRepository usersRepository;
//    @Test
//    public void shouldReturnUserWithName() {
//        usersRepository.save(new User(null,"v","009"));
//        Optional<User> user = usersRepository.findOneByNameAndPassword("v","009");
//        assertTrue(user.isPresent());
//        assertThat(user.get().getName(),is("v"));
//    }
//}