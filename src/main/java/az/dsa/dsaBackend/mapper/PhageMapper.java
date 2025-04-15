package az.dsa.dsaBackend.mapper;

import az.dsa.dsaBackend.dto.PhageDTO;
import az.dsa.dsaBackend.entity.Phage;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PhageMapper {

    PhageDTO toDto(Phage phage);

    Phage toEntity(PhageDTO phageDTO);
}
