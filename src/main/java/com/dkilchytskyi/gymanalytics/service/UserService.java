package com.dkilchytskyi.gymanalytics.service;

import com.dkilchytskyi.gymanalytics.model.User;
import com.dkilchytskyi.gymanalytics.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;

    public List<User> getAll() {
        return this.repository.findAll();
    }
    public User create(User user) {
        return this.repository.save(user);
    }
}
