package com.huce.quiz_app.services;

import com.huce.quiz_app.entities.User;
import com.huce.quiz_app.iservices.IUserService;
import com.huce.quiz_app.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }
}