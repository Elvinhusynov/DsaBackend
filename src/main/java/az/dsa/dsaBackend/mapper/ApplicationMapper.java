package az.dsa.dsaBackend.mapper;

import az.dsa.dsaBackend.dto.ApplicationDto;
import az.dsa.dsaBackend.entity.Application;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ApplicationMapper {

    ApplicationDto toDto(Application entity);
    Application toEntity(ApplicationDto dto);

}


