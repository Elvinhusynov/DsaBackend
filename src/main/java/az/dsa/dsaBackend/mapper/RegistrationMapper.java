package az.dsa.dsaBackend.mapper;

import az.dsa.dsaBackend.dto.RegistrationDTO;
import az.dsa.dsaBackend.dto.RegistrationRequest;
import az.dsa.dsaBackend.entity.Registration;
import org.springframework.stereotype.Component;

@Component
public class RegistrationMapper {

    public RegistrationDTO toDTO(Registration registration) {
        RegistrationDTO dto = new RegistrationDTO();
        dto.setId(registration.getId());
        dto.setFullName(registration.getFullName());
        dto.setEmail(registration.getEmail());
        dto.setPhone(registration.getPhone());
        dto.setEventDate(registration.getEventDate());
        return dto;
    }

    public Registration toEntity(RegistrationRequest request) {
        Registration registration = new Registration();
        registration.setFullName(request.getFullName());
        registration.setEmail(request.getEmail());
        registration.setPhone(request.getPhone());
        registration.setEventDate(request.getEventDate());
        return registration;
    }
}
