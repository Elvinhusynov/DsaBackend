package az.dsa.dsaBackend.service;

import az.dsa.dsaBackend.dto.TrainerDto;
import az.dsa.dsaBackend.entity.Trainer;
import az.dsa.dsaBackend.mapper.TrainerMapper;
import az.dsa.dsaBackend.repository.TrainerRepository;
import az.dsa.dsaBackend.service.TrainerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TrainerServiceImpl implements TrainerService {
    private final TrainerRepository trainerRepository;
    private final TrainerMapper trainerMapper;

    @Override
    public TrainerDto createTrainer(TrainerDto dto) {
        Trainer trainer = trainerMapper.toEntity(dto);
        return trainerMapper.toDto(trainerRepository.save(trainer));
    }

    @Override
    public List<TrainerDto> getAllTrainers() {
        return trainerRepository.findAll().stream()
                .map(trainerMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public TrainerDto getTrainerById(Long id) {
        Trainer trainer = trainerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Trainer not found"));
        return trainerMapper.toDto(trainer);
    }

    @Override
    public void deleteTrainer(Long id) {
        trainerRepository.deleteById(id);
    }
}
