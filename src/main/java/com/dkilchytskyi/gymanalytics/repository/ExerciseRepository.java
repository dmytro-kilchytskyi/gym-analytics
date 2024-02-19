package com.dkilchytskyi.gymanalytics.repository;

import com.dkilchytskyi.gymanalytics.model.Exercise;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExerciseRepository extends MongoRepository<Exercise, String> {
}
