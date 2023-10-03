package com.example.authservice.resource;

import com.example.authservice.core.dto.UserResponseData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "user-service", path = "/users")
public interface UserFeignClient {
    @GetMapping(value = "/{userId}")
    UserResponseData getUserById(@PathVariable("userId") String userId);
}
