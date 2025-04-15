package az.dsa.dsaBackend.mapper;

import az.dsa.dsaBackend.dto.TeacherDto;
import az.dsa.dsaBackend.entity.Teacher;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TeacherMapper {

    TeacherDto toDto(Teacher teacher);

    Teacher toEntity(TeacherDto dto);
}
