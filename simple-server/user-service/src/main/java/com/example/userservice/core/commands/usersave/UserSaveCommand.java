package com.example.userservice.core.commands.usersave;


import com.example.commonproject.cqs.Command;
import com.example.userservice.core.queries.userfind.UserResponseData;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserSaveCommand implements Command<UserResponseData> {
    private String userId;
    private String password;
    private String name;

    public UserSaveCommand(String userId, String password, String name) {
        this.userId = userId;
        this.password = password;
        this.name = name;
    }
}
