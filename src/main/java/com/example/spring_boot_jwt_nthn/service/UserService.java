package com.example.spring_boot_jwt_nthn.service;

import com.example.spring_boot_jwt_nthn.entity.User;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipal;


public interface UserService {
    User createUser(User user);

}
