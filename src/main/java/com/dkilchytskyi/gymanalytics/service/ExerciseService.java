package com.dkilchytskyi.gymanalytics.service;

import com.dkilchytskyi.gymanalytics.exception.NotFoundException;
import com.dkilchytskyi.gymanalytics.model.Exercise;
import com.dkilchytskyi.gymanalytics.repository.ExerciseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ExerciseService {
    private final ExerciseRepository repository;

    public List<Exercise> getAll() {
        return repository.findAll();
    }
    public Exercise create(Exercise exercise) {
        return repository.save(exercise);
    }

    public Exercise update(String id, Exercise exerciseUpdate) {
        var exercise = findById(id);
        exercise.setName(exerciseUpdate.getName());

        return repository.save(exercise);
    }

    public void delete(String id) {
        repository.delete(findById(id));
    }

    private Exercise findById(String id) {
        return repository.findById(id).orElseThrow(NotFoundException::new);
    }
}
