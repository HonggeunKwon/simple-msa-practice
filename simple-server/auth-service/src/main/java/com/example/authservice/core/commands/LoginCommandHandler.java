package com.example.authservice.core.commands;

import com.example.authservice.core.dto.UserResponseData;
import com.example.authservice.resource.UserFeignClient;
import com.example.commonproject.cqs.CommandHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class LoginCommandHandler implements CommandHandler<UserResponseData, LoginCommand> {
    private final UserFeignClient userFeignClient;
    @Override
    public UserResponseData handle(LoginCommand command) {
        return userFeignClient.getUserById(command.getUserId());
    }
}
