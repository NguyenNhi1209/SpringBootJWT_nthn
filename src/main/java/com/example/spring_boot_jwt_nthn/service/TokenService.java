package com.example.spring_boot_jwt_nthn.service;

import com.example.spring_boot_jwt_nthn.entity.Token;

public interface TokenService {
    Token createToken(Token token);
}
