package az.dsa.dsaBackend.controller;

import az.dsa.dsaBackend.dto.TrainerDto;
import az.dsa.dsaBackend.service.TrainerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/trainers")
@RequiredArgsConstructor
public class TrainerController {
    private final TrainerService trainerService;

    @PostMapping
    public TrainerDto createTrainer(@RequestBody TrainerDto dto) {
        return trainerService.createTrainer(dto);
    }

    @GetMapping
    public List<TrainerDto> getAllTrainers() {
        return trainerService.getAllTrainers();
    }

    @GetMapping("/{id}")
    public TrainerDto getTrainerById(@PathVariable Long id) {
        return trainerService.getTrainerById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteTrainer(@PathVariable Long id) {
        trainerService.deleteTrainer(id);
    }
}
