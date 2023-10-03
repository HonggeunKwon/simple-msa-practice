package com.example.userservice.core.commands.usersave;

import com.example.commonproject.cqs.CommandHandler;
import com.example.userservice.core.queries.userfind.UserResponseData;
import com.example.userservice.db.UserRepository;
import com.example.userservice.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserSaveHandler implements CommandHandler<UserResponseData, UserSaveCommand> {
    private final UserRepository userRepository;

    @Override
    public UserResponseData handle(UserSaveCommand command) {
        User user = new User(command.getUserId(), command.getPassword(), command.getName());
        userRepository.save(user);
        return UserResponseData.from(user);
    }
}
