package com.example.userservice.resource;

import com.example.commonproject.cqs.Bus;
import com.example.userservice.core.commands.usersave.UserSaveCommand;
import com.example.userservice.core.queries.userfind.UserFindQuery;
import com.example.userservice.core.queries.userfind.UserResponseData;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserApiController {
    private final Bus bus;

    @GetMapping("/{userId}")
    public UserResponseData getUserById(@PathVariable String userId) {
        return bus.executeQuery(new UserFindQuery(userId));
    }

    @PostMapping
    public UserResponseData joinUser(@RequestBody UserSaveCommand userSaveCommand) {
        return bus.executeCommand(userSaveCommand);
    }
}
