package az.dsa.dsaBackend.service;

import az.dsa.dsaBackend.dto.PhageDTO;
import az.dsa.dsaBackend.entity.Phage;
import az.dsa.dsaBackend.exception.PhageNotFoundException;
import az.dsa.dsaBackend.mapper.PhageMapper;
import az.dsa.dsaBackend.repository.PhageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PhageServiceImpl implements PhageService {
    private final PhageRepository repository;
    private final PhageMapper mapper;

    @Override
    public List<PhageDTO> getAllPhages() {
        return repository.findAll().stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public PhageDTO getPhageById(Long id) {
        return repository.findById(id)
                .map(mapper::toDto)
                .orElseThrow(() -> new PhageNotFoundException(id));
    }

    @Override
    public PhageDTO createPhage(PhageDTO phageDTO) {
        Phage phage = mapper.toEntity(phageDTO);
        return mapper.toDto(repository.save(phage));
    }

    @Override
    public void deletePhage(Long id) {
        if (!repository.existsById(id)) {
            throw new PhageNotFoundException(id);
        }
        repository.deleteById(id);
    }
}
