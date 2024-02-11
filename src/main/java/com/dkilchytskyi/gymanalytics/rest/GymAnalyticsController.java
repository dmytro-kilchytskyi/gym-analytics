package com.dkilchytskyi.gymanalytics.rest;

import com.dkilchytskyi.gymanalytics.model.User;
import com.dkilchytskyi.gymanalytics.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class GymAnalyticsController {
    private final UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return this.userService.getAll();
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return userService.create(user);
    }
}
