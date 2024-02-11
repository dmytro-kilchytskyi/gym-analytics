package com.dkilchytskyi.gymanalytics.repository;

import com.dkilchytskyi.gymanalytics.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
