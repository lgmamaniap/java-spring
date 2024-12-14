package com.cursojava.curso.controllers;

import com.cursojava.curso.models.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @RequestMapping(value = "demo")
    public List<String> demo() {
        return List.of("Element 1", "Element 2", "Element 3");
    }

    @RequestMapping(value = "users", method = RequestMethod.GET)
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        User user = new User();
        user.setName("Luis 1");
        user.setLastName("Aguirre");
        user.setEmail("luis77@gmail.com");
        user.setPhone("77766543");
        user.setPassword("admin123");

        User user2 = new User();
        user2.setId(1234L);
        user2.setName("Luis 2");
        user2.setLastName("Aguirre");
        user2.setEmail("luis77@gmail.com");
        user2.setPhone("77766543");
        user2.setPassword("admin123");

        User user3 = new User();
        user3.setId(5678L);
        user3.setName("Luis 3");
        user3.setLastName("Aguirre");
        user3.setEmail("luis77@gmail.com");
        user3.setPhone("77766543");
        user3.setPassword("admin123");

        users.add(user);
        users.add(user2);
        users.add(user3);

        return users;
    }

    @RequestMapping(value = "user/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable Long id) {
        User user = new User();
        user.setId(id);
        user.setName("Luis");
        user.setLastName("Aguirre");
        user.setEmail("luis77@gmail.com");
        user.setPhone("77766543");
        user.setPassword("admin123");
        return user;
    }

    @RequestMapping(value = "user/{id}", method = RequestMethod.PUT)
    public User editUser(@PathVariable Long id) {
        User user = new User();
        user.setId(id);
        user.setName("Luis");
        user.setLastName("Aguirre");
        user.setEmail("luis77@gmail.com");
        user.setPhone("77766543");
        user.setPassword("admin123");
        return user;
    }

    @RequestMapping(value = "user/{id}", method = RequestMethod.DELETE)
    public User deleteUser(@PathVariable Long id) {
        User user = new User();
        user.setId(id);
        user.setName("Luis");
        user.setLastName("Aguirre");
        user.setEmail("luis77@gmail.com");
        user.setPhone("77766543");
        user.setPassword("admin123");
        return user;
    }

    @RequestMapping(value = "user", method = RequestMethod.GET)
    public User searchUser() {
        User user = new User();
        user.setName("Luis");
        user.setLastName("Aguirre");
        user.setEmail("luis77@gmail.com");
        user.setPhone("77766543");
        user.setPassword("admin123");
        return user;
    }
}
