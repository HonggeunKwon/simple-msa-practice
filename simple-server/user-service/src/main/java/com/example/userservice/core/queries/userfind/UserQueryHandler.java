package com.example.userservice.core.queries.userfind;

import com.example.userservice.domain.User;
import com.example.commonproject.cqs.QueryHandler;
import org.springframework.stereotype.Component;

@Component
public class UserQueryHandler implements QueryHandler<UserResponseData, UserFindQuery> {
    @Override
    public UserResponseData handle(UserFindQuery command) {
        User foundUser = findFromUserRepo(command);
        return UserResponseData.from(foundUser);
    }

    private User findFromUserRepo(UserFindQuery command) {
        // find from userRepo
        return new User("kakao_user", "1234", "charles");
    }
}
