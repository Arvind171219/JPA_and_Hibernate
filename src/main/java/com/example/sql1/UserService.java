package com.example.sql1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public String addUser(User user){
        userRepository.save(user);
        return "Added succesfully";
    }

    public User getUser(int id){
        User user=userRepository.findById(id).get();
        return user;
    }

}
