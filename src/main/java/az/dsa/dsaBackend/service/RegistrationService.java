package az.dsa.dsaBackend.service;

import az.dsa.dsaBackend.dto.RegistrationDTO;
import az.dsa.dsaBackend.dto.RegistrationRequest;
import az.dsa.dsaBackend.entity.Registration;
import az.dsa.dsaBackend.exception.ResourceNotFoundException;
import az.dsa.dsaBackend.mapper.RegistrationMapper;
import az.dsa.dsaBackend.repository.RegistrationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RegistrationService {

    private final RegistrationRepository registrationRepository;
    private final RegistrationMapper registrationMapper;

    public RegistrationDTO createRegistration(RegistrationRequest request) {
        if (registrationRepository.existsByEmail(request.getEmail())) {
            throw new RuntimeException("Email already registered");
        }

        Registration registration = registrationMapper.toEntity(request);
        Registration savedRegistration = registrationRepository.save(registration);
        return registrationMapper.toDTO(savedRegistration);
    }

    public List<RegistrationDTO> getAllRegistrations() {
        return registrationRepository.findAll()
                .stream()
                .map(registrationMapper::toDTO)
                .collect(Collectors.toList());
    }

    public RegistrationDTO getRegistrationById(Long id) {
        Registration registration = registrationRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Registration not found with id: " + id));
        return registrationMapper.toDTO(registration);
    }

    public void deleteRegistration(Long id) {
        if (!registrationRepository.existsById(id)) {
            throw new ResourceNotFoundException("Registration not found with id: " + id);
        }
        registrationRepository.deleteById(id);
    }
}
