package com.example.authservice.core.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserResponseData {
    private Long id;
    private String userId;
    private String password;
    private String name;

    @Builder
    public UserResponseData(Long id, String userId, String password, String name) {
        this.id = id;
        this.userId = userId;
        this.password = password;
        this.name = name;
    }
}
