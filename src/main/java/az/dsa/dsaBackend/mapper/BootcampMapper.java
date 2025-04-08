package az.dsa.dsaBackend.mapper;

import az.dsa.dsaBackend.dto.BootcampDto;
import az.dsa.dsaBackend.entity.Bootcamp;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BootcampMapper {
    BootcampMapper INSTANCE = Mappers.getMapper(BootcampMapper.class);

    BootcampDto toDto(Bootcamp bootcamp);

    Bootcamp toEntity(BootcampDto dto);

    List<BootcampDto> toDtoList(List<Bootcamp> list);

    List<Bootcamp> toEntityList(List<BootcampDto> list);
}
