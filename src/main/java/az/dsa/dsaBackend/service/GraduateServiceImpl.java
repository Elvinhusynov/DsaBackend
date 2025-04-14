package az.dsa.dsaBackend.service;

import az.dsa.dsaBackend.dto.GraduateDto;
import az.dsa.dsaBackend.entity.Graduate;
import az.dsa.dsaBackend.exception.NotFoundException;
import az.dsa.dsaBackend.mapper.GraduateMapper;
import az.dsa.dsaBackend.repository.GraduateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GraduateServiceImpl implements GraduateService{
    private final GraduateRepository repository;
    private final GraduateMapper mapper;

    @Override
    public GraduateDto createGraduate(GraduateDto dto) {
        Graduate graduate = mapper.toEntity(dto);
        return mapper.toDto(repository.save(graduate));
    }

    @Override
    public List<GraduateDto> getAllGraduate() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public GraduateDto getGraduateById(Long id) {
        Graduate graduate = repository.findById(id)
                .orElseThrow(() -> new NotFoundException("Graduate not found"));
        return mapper.toDto(graduate);
    }

    @Override
    public GraduateDto updateGraduate(Long id, GraduateDto dto) {
        Graduate existing = repository.findById(id)
                .orElseThrow(() -> new NotFoundException("Graduate not found"));

        existing.setImage(dto.getImage());
        existing.setName(dto.getName());
        existing.setWorkPosition(dto.getWorkPosition());
        existing.setWorkLocation(dto.getWorkLocation());
        existing.setCreatedAt(dto.getCreatedAt());
        existing.setUpdateAt(dto.getUpdateAt());

        return mapper.toDto(repository.save(existing));
    }

    @Override
    public void deleteGraduate(Long id) {
        repository.deleteById(id);
    }

}
