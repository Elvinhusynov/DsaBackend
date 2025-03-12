package az.dsa.dsaBackend.mapper;

import az.dsa.dsaBackend.dto.ApplicationDto;
import az.dsa.dsaBackend.entity.Application;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ApplicationMapper {
    ApplicationMapper INSTANCE = Mappers.getMapper(ApplicationMapper.class);

    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "modifiedAt", ignore = true)
    Application toEntity(ApplicationDto dto);

    ApplicationDto toDto(Application application);
}


