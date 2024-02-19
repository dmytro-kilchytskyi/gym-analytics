package com.dkilchytskyi.gymanalytics.rest;

import com.dkilchytskyi.gymanalytics.model.Exercise;
import com.dkilchytskyi.gymanalytics.service.ExerciseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/exercises")
public class ExerciseController {
    private final ExerciseService service;
    @GetMapping
    public List<Exercise> getExercises() {
        return service.getAll();
    }

    @PostMapping
    public Exercise createExercise(@RequestBody Exercise exercise) {
        return service.create(exercise);
    }

    @PutMapping("/{exerciseId}")
    public Exercise updateExercise(@PathVariable("exerciseId") String exerciseId, @RequestBody Exercise exercise) {
        return service.update(exerciseId, exercise);
    }

    @DeleteMapping("/{exerciseId}")
    public void deleteExercise(@PathVariable("exerciseId") String exerciseId) {
        service.delete(exerciseId);
    }
}
