package com.example.demo.mycontroller;

import com.example.demo.dto.MyResponseDto;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@RestController

public class UserController {

    public UserController(UserService userService) {
        this.userService = userService;
        System.out.println("Inside the controller constructor");
    }

    @PostConstruct
    public void init(){
        System.out.println("Inside user controller post constructor");

    }

    @Autowired
    private UserService userService;
    @PostMapping(value = "/update/employee/{id}")
    public boolean updateEmployee(@PathVariable String id, @RequestBody MyResponseDto request){

        return userService.updateEmployee(request,id);
    }

}
