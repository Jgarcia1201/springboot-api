package com.example.productivity.Controller;

import com.example.productivity.Model.User;
import com.example.productivity.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/user")
@CrossOrigin("http://localhost:4200")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{email}")
    public Optional<User> findByEmail(@PathVariable(value = "email") String email) {
        return userService.findByEmail(email);
    }

    @GetMapping()
    public Iterable<User> findAllUsers() {
        return userService.findAllUsers();
    }


}