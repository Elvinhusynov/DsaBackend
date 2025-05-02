package az.dsa.dsaBackend.mapper;

import az.dsa.dsaBackend.dto.TrainerDto;
import az.dsa.dsaBackend.entity.Trainer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface TrainerMapper {
    TrainerMapper INSTANCE = Mappers.getMapper(TrainerMapper.class);

    TrainerDto toDto(Trainer trainer);

    Trainer toEntity(TrainerDto dto);
}
