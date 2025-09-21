package com.example.journalApp.Controller;

import com.example.journalApp.Entity.User;
import com.example.journalApp.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/public")

public class PublicController {


    private final UserService userService;

    public PublicController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/health")
    public String healthCheck(){
        return "Ok";
    }

    @PostMapping("/create-user")
    public void createUser(@RequestBody User user){
        userService.saveNewUser(user);
    }

}
