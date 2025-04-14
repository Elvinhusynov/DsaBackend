package az.dsa.dsaBackend.service;
import az.dsa.dsaBackend.dto.BootcampTipiDTO;
import az.dsa.dsaBackend.entity.BootcampTipi;
import az.dsa.dsaBackend.exception.ResourceNotFoundException;
import az.dsa.dsaBackend.mapper.BootcampTipiMapper;
import az.dsa.dsaBackend.repository.BootcampTipiRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor

public class BootcampTipiService {

    private final BootcampTipiRepository repository;
    private final BootcampTipiMapper bootcampTipiMapper;

    public List<BootcampTipiDTO> getAll() {
        return repository.findAll()
                .stream()
                .map(bootcampTipiMapper::toDto)
                .collect(Collectors.toList());
    }

    public BootcampTipiDTO getById(Long id) {
        return repository.findById(id)
                .map(bootcampTipiMapper::toDto)
                .orElseThrow(() -> new ResourceNotFoundException("Bootcamp tipi tapılmadı"));
    }

    public BootcampTipiDTO create(BootcampTipiDTO dto) {
        BootcampTipi entity = bootcampTipiMapper.toEntity(dto);
        return bootcampTipiMapper.toDto(repository.save(entity));
    }

    public BootcampTipiDTO update(Long id, BootcampTipiDTO dto) {
        BootcampTipi existing = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Bootcamp tipi tapılmadı"));

        bootcampTipiMapper.updateEntityFromDto(dto, existing);
        return bootcampTipiMapper.toDto(repository.save(existing));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
