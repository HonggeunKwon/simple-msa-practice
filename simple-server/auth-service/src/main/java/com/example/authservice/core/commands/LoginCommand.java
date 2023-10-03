package com.example.authservice.core.commands;

import com.example.authservice.core.dto.UserResponseData;
import com.example.commonproject.cqs.Command;
import lombok.Getter;

@Getter
public class LoginCommand implements Command<UserResponseData> {
    private String userId;

    public LoginCommand(String userId) {
        this.userId = userId;
    }
}
