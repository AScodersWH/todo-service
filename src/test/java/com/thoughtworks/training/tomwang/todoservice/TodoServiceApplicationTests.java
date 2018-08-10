//package com.thoughtworks.training.tomwang.todoservice;
//
//import com.google.common.collect.ImmutableList;
//import com.google.common.collect.ImmutableSet;
//import com.sun.javafx.collections.ImmutableObservableList;
//import com.thoughtworks.training.tomwang.todoservice.model.Todo;
//import com.thoughtworks.training.tomwang.todoservice.model.User;
//import com.thoughtworks.training.tomwang.todoservice.repository.TablesRepository;
//import com.thoughtworks.training.tomwang.todoservice.repository.UsersRepository;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mock;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.security.test.context.support.WithMockUser;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//import sun.invoke.empty.Empty;
//
//import javax.swing.text.html.Option;
//
//import java.util.Optional;
//
//import static org.junit.Assert.assertThat;
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//@AutoConfigureMockMvc
//public class TodoServiceApplicationTests {
//	@Autowired
//	private MockMvc mockMvc;
//	@MockBean
//	private UsersRepository usersRepository;
//
//
//	@Test
//
//	public void should() throws Exception {
//        Optional<User> user = Optional.empty() ;
//
//		when(usersRepository.findOneByNameAndPassword("v","009"))
//                .thenReturn(user);
//		mockMvc.perform(get("/user"))
//				.andExpect(status().isOk())
//				.andExpect(jsonPath("$.length()").value(1))
//				.andExpect(jsonPath("$[1].name").value("0"))
//				.andExpect(jsonPath("$[1].password").value("22"))
//				.andReturn();
//	}
//
//	@Test
//    @WithMockUser(username = "v")
//    public void shouldReturn401GetAllTodos() throws Exception{
//	    MvcResult result = mockMvc
//                .perform(get("/user"))
//                .andExpect(status().isUnauthorized())
//                .andReturn();
//
//    }
//
//}
