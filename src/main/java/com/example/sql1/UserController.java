package com.example.sql1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/add")
    public String addUser(@RequestBody User user){
     return userService.addUser(user);
    }
    @GetMapping("/getuser")
    public User getUser(@RequestParam("id") int id){
        return userService.getUser(id);
    }
}
