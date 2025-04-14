package az.dsa.dsaBackend.service;

import az.dsa.dsaBackend.entity.Training;
import az.dsa.dsaBackend.repository.TrainingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TrainingServiceImpl implements TrainingService{
    private final TrainingRepository repository;

    @Override
    public Training save(Training training) {
        return repository.save(training);
    }

    @Override
    public List<Training> getAll() {
        return repository.findAll();
    }

    @Override
    public Training getById(String id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}
