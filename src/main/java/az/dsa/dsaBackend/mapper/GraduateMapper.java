package az.dsa.dsaBackend.mapper;

import az.dsa.dsaBackend.dto.GraduateDto;
import az.dsa.dsaBackend.entity.Graduate;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface GraduateMapper {
    GraduateDto toDto(Graduate graduate);

    Graduate toEntity(GraduateDto dto);
}
