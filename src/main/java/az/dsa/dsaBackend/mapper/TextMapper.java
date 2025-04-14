package az.dsa.dsaBackend.mapper;

import az.dsa.dsaBackend.dto.TextDto;
import az.dsa.dsaBackend.entity.Text;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TextMapper {

    TextDto toDto(Text text);
    Text toEntity(TextDto dto);
}
