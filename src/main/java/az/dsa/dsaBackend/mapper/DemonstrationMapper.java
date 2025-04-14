package az.dsa.dsaBackend.mapper;

import az.dsa.dsaBackend.dto.DemonstrationDto;
import az.dsa.dsaBackend.entity.Demonstration;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DemonstrationMapper {
    DemonstrationDto toDto(Demonstration demonstration);
    Demonstration toEntity(DemonstrationDto dto);
    List<DemonstrationDto> toDtoList(List<Demonstration> list);
}
