package com.example.demo.services;

import com.example.demo.dto.MyResponseDto;

public interface UserService {
    boolean updateEmployee(MyResponseDto request, String id);

}
