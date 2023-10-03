package com.example.authservice.resource;

import com.example.authservice.core.commands.LoginCommand;
import com.example.authservice.core.commands.LoginCommandResponse;
import com.example.authservice.core.dto.UserResponseData;
import com.example.commonproject.cqs.Bus;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/auth")
public class AuthController {

    private final Bus bus;

    @GetMapping("/{userId}")
    public UserResponseData login(@PathVariable String userId) {
        return bus.executeCommand(new LoginCommand(userId));
    }

    @GetMapping
    public UserResponseData test(@PathVariable String userId) {
        return bus.executeCommand(new LoginCommand(userId));
    }
}
