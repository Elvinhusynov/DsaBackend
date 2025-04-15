package az.dsa.dsaBackend.mapper;

import az.dsa.dsaBackend.dto.SyllabusDto;
import az.dsa.dsaBackend.entity.Syllabus;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SyllabusMapper {
    SyllabusDto toDto(Syllabus entity);

    Syllabus toEntity(SyllabusDto dto);
}
