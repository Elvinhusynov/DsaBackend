package az.dsa.dsaBackend.service;

import az.dsa.dsaBackend.dto.TrainerDto;

import java.util.List;

public interface TrainerService {

    TrainerDto createTrainer(TrainerDto dto);

    List<TrainerDto> getAllTrainers();

    TrainerDto getTrainerById(Long id);

    void deleteTrainer(Long id);
}
