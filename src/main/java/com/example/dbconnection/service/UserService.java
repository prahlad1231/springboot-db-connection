package com.example.dbconnection.service;

import com.example.dbconnection.model.UserEntity;
import com.example.dbconnection.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserEntity> findAll() {
        return userRepository.findAll();
    }

    public UserEntity save(UserEntity user) {
        // you would have to encode the password in real application before saving
        return userRepository.save(user);
    }

    public UserEntity update(UserEntity user) {
        return userRepository.save(user);
    }

    public UserEntity findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public UserEntity deleteById(Long id) {
        UserEntity user = userRepository.findById(id).orElse(null);
        if (user == null) throw new RuntimeException("User not found!");
        userRepository.deleteById(id);
        return user;
    }

    public UserEntity findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public UserEntity findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
