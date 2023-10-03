package com.example.userservice.db;

import com.example.userservice.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface UserJpaRepository extends JpaRepository<User, Long>, UserRepository {
    User findUserByUserId(String userId);

    @Override
    default User findByUserId(String userId) {
        return findUserByUserId(userId);
    }

    @Override
    default User save(User user) {
        return save(user);
    }
}
