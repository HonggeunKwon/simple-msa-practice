package com.example.userservice.db;

import com.example.userservice.domain.User;

public interface UserRepository {
    User findByUserId(String userId);
    User save(User user);
}
