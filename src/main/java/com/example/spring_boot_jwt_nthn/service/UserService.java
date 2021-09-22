package com.example.spring_boot_jwt_nthn.service;

import com.example.spring_boot_jwt_nthn.authen.UserPrincipal;
import com.example.spring_boot_jwt_nthn.entity.User;
import org.springframework.stereotype.Service;




public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
}
