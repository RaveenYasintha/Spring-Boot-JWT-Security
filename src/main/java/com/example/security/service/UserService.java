package com.example.security.service;

import com.example.security.dto.UserDto;

public interface UserService {
    UserDto registerUser(UserDto userDto);

    UserDto userLogin(UserDto dto);
}
