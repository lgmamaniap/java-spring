package com.cursojava.curso.controllers;

import com.cursojava.curso.dao.UserDao;
import com.cursojava.curso.dto.CreateUserDto;
import com.cursojava.curso.models.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {


    private final UserDao userDao;

    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @GetMapping(value = "demo")
    public List<String> demo() {
        return List.of("Element 1", "Element 2", "Element 3");
    }

    @GetMapping(value = "list")
    public List<User> getUsers() {
        return userDao.getUsers();
    }

    @PostMapping
    public CreateUserDto createUser (@RequestBody User user) {
        CreateUserDto response = new CreateUserDto();
        response.setId(123L);
        return response;
    }

    @DeleteMapping(value = "/{id}")
    public void deleteUser(@PathVariable Long id) {
        userDao.deleteUser(id);
    }
}
