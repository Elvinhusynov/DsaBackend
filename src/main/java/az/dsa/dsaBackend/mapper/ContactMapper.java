package az.dsa.dsaBackend.mapper;

import az.dsa.dsaBackend.dto.ContactDto;
import az.dsa.dsaBackend.entity.Contact;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ContactMapper {
    ContactMapper INSTANCE = Mappers.getMapper(ContactMapper.class);

    @Mapping(target = "contactId", ignore = true)
    @Mapping(target = "createdAt", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "updateAt", expression = "java(java.time.LocalDateTime.now())")
    Contact toEntity(ContactDto dto);

    ContactDto toDto(Contact entity);
}
