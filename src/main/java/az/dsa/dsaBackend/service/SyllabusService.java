package az.dsa.dsaBackend.service;

import az.dsa.dsaBackend.dto.SyllabusDto;
import az.dsa.dsaBackend.entity.Syllabus;
import az.dsa.dsaBackend.exception.SyllabusNotFoundException;
import az.dsa.dsaBackend.mapper.SyllabusMapper;
import az.dsa.dsaBackend.repository.SyllabusRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SyllabusService {
    private final SyllabusRepository syllabusRepository;
    private final SyllabusMapper syllabusMapper;

    public List<SyllabusDto> getAllSyllabuses() {
        return syllabusRepository.findAll()
                .stream()
                .map(syllabusMapper::toDto)
                .collect(Collectors.toList());
    }

    public SyllabusDto createSyllabus(SyllabusDto syllabusDto) {
        Syllabus syllabus = syllabusMapper.toEntity(syllabusDto);
        syllabus = syllabusRepository.save(syllabus);
        return syllabusMapper.toDto(syllabus);
    }
    public SyllabusDto getById(Long id) {
        Syllabus syllabus = syllabusRepository.findById(id)
                .orElseThrow(() -> new SyllabusNotFoundException(id));
        return syllabusMapper.toDto(syllabus);
    }

    public SyllabusDto updateSyllabus(Long id, SyllabusDto syllabusDto) {
        Syllabus existing = syllabusRepository.findById(id)
                .orElseThrow(() -> new SyllabusNotFoundException(id));

        existing.setTitle(syllabusDto.getTitle());
        existing.setDescription(syllabusDto.getDescription());
        existing.setLabel(syllabusDto.getLabel());
        existing.setInformation(syllabusDto.getInformation());
        existing.setMetinler(syllabusDto.getMetinler());
        existing.setUpdatedAt(syllabusDto.getUpdatedAt());

        syllabusRepository.save(existing);
        return syllabusMapper.toDto(existing);
    }

    public void deleteSyllabus(Long id) {
        if (!syllabusRepository.existsById(id)) {
            throw new SyllabusNotFoundException(id);
        }
        syllabusRepository.deleteById(id);
    }
}
