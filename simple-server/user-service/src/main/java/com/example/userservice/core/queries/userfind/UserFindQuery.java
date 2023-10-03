package com.example.userservice.core.queries.userfind;

import com.example.commonproject.cqs.Query;
import lombok.Data;

@Data
public class UserFindQuery implements Query<UserResponseData> {
    String userId;

    public UserFindQuery(String userId) {
        this.userId = userId;
    }
}
