package az.dsa.dsaBackend.service;

import az.dsa.dsaBackend.dto.BootcampDto;
import az.dsa.dsaBackend.entity.Bootcamp;
import az.dsa.dsaBackend.exception.ResourceNotFoundException;
import az.dsa.dsaBackend.mapper.BootcampMapper;
import az.dsa.dsaBackend.repository.BootcampRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class BootcampServiceImpl implements BootcampService{
    private final BootcampRepository repository;
    private final BootcampMapper mapper;

    @Override
    public List<BootcampDto> getAllBootcamps() {
        return mapper.toDtoList(repository.findAll());
    }

    @Override
    public BootcampDto getBootcampById(Long id) {
        Bootcamp bootcamp = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Bootcamp not found"));
        return mapper.toDto(bootcamp);
    }

    @Override
    public BootcampDto createBootcamp(BootcampDto dto) {
        Bootcamp saved = repository.save(mapper.toEntity(dto));
        return mapper.toDto(saved);
    }

    @Override
    public BootcampDto updateBootcamp(Long id, BootcampDto dto) {
        Bootcamp existing = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Bootcamp not found"));
        dto.setBootcampsId(id);
        Bootcamp updated = repository.save(mapper.toEntity(dto));
        return mapper.toDto(updated);
    }

    @Override
    public void deleteBootcamp(Long id) {
        repository.deleteById(id);
    }
}

