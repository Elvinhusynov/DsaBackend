package az.dsa.dsaBackend.mapper;

import az.dsa.dsaBackend.dto.BootcampTipiDTO;
import az.dsa.dsaBackend.entity.BootcampTipi;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface BootcampTipiMapper {
    BootcampTipiDTO toDto(BootcampTipi entity);
    BootcampTipi toEntity(BootcampTipiDTO dto);

    void updateEntityFromDto(BootcampTipiDTO dto, @MappingTarget BootcampTipi entity);
}

