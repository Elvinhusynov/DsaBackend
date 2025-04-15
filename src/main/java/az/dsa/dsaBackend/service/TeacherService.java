package az.dsa.dsaBackend.service;

import az.dsa.dsaBackend.dto.TeacherDto;
import az.dsa.dsaBackend.entity.Teacher;
import az.dsa.dsaBackend.exception.TeacherNotFoundException;
import az.dsa.dsaBackend.mapper.TeacherMapper;
import az.dsa.dsaBackend.repository.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TeacherService {
    private final TeacherRepository teacherRepository;
    private final TeacherMapper teacherMapper;

    public TeacherDto createTeacher(TeacherDto dto) {
        Teacher teacher = teacherMapper.toEntity(dto);
        Teacher saved = teacherRepository.save(teacher);
        return teacherMapper.toDto(saved);
    }

    public List<TeacherDto> getAllTeachers() {
        return teacherRepository.findAll()
                .stream()
                .map(teacherMapper::toDto)
                .collect(Collectors.toList());
    }

    public TeacherDto getById(Long id) {
        Teacher teacher = teacherRepository.findById(id)
                .orElseThrow(() -> new TeacherNotFoundException(id));
        return teacherMapper.toDto(teacher);
    }

    public TeacherDto updateTeacher(Long id, TeacherDto dto) {
        Teacher teacher = teacherRepository.findById(id)
                .orElseThrow(() -> new TeacherNotFoundException(id));

        teacher.setName(dto.getName());
        teacher.setInfo(dto.getInfo());
        teacher.setImage(dto.getImage());
        teacher.setWorkPosition(dto.getWorkPosition());
        teacher.setWorkLocation(dto.getWorkLocation());
        teacher.setCreatedAt(dto.getCreatedAt());
        teacher.setUpdatedAt(dto.getUpdatedAt());

        Teacher updated = teacherRepository.save(teacher);
        return teacherMapper.toDto(updated);
    }

    public void deleteTeacher(Long id) {
        if (!teacherRepository.existsById(id)) {
            throw new TeacherNotFoundException(id);
        }
        teacherRepository.deleteById(id);
    }
}
