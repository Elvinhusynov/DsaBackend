package az.dsa.dsaBackend.controller;

import az.dsa.dsaBackend.entity.Training;
import az.dsa.dsaBackend.service.TrainingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/trainings")
@RequiredArgsConstructor
public class TrainingController {
    private final TrainingService service;

    @PostMapping
    public Training create(@RequestBody Training training) {
        return service.save(training);
    }

    @GetMapping
    public List<Training> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Training getById(@PathVariable String id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
