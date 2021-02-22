package com.example.demo.services.impl;

import com.example.demo.dto.MyResponseDto;
import com.example.demo.services.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class UserServicesImpl implements UserService {

    public UserServicesImpl()
    {
        System.out.println("inside user service constructor");
    }

    @PostConstruct
    public void init()
    {
        System.out.println("inside user service post construct");
    }

    @Override
    public boolean updateEmployee(MyResponseDto request,String id){
        System.out.println("Request: "+request+" "+"ID: "+id);
        return false;
    }

}
