package az.dsa.dsaBackend.service;

import az.dsa.dsaBackend.entity.Demonstration;
import az.dsa.dsaBackend.repository.DemonstrationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DemonstrationService {
    private final DemonstrationRepository demonstrationRepository;

    public List<Demonstration> getAll() {
        return demonstrationRepository.findAll();
    }

    public Optional<Demonstration> getById(Long id) {
        return demonstrationRepository.findById(id);
    }

    public Demonstration create(Demonstration demonstration) {
        return demonstrationRepository.save(demonstration);
    }

    public void delete(Long id) {
        demonstrationRepository.deleteById(id);
    }
}
