package com.example.productivity.Service;

import com.example.productivity.Model.User;
import com.example.productivity.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public Optional<User> findByEmail(String email) {
        Optional<User> res = userRepo.findByEmail(email);
        return res;
    }

    public Iterable<User> findAllUsers() {
        return userRepo.findAll();
    }
}
