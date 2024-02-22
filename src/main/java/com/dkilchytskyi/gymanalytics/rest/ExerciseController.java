package com.dkilchytskyi.gymanalytics.rest;

import com.dkilchytskyi.gymanalytics.model.Exercise;
import com.dkilchytskyi.gymanalytics.service.ExerciseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/exercises")
public class ExerciseController {
    private final ExerciseService service;
    @GetMapping
    public List<Exercise> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Exercise create(@RequestBody Exercise exercise) {
        return service.create(exercise);
    }

    @PutMapping("/{id}")
    public Exercise update(@PathVariable("id") String id, @RequestBody Exercise exercise) {
        return service.update(id, exercise);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id) {
        service.delete(id);
    }
}
