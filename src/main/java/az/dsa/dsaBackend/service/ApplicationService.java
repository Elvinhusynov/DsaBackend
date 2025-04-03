package az.dsa.dsaBackend.service;


import az.dsa.dsaBackend.dto.ApplicationDto;
import az.dsa.dsaBackend.entity.Application;
import az.dsa.dsaBackend.mapper.ApplicationMapper;
import az.dsa.dsaBackend.repository.ApplicationRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Slf4j
@Service
@RequiredArgsConstructor
public class ApplicationService {
    private final ApplicationRepository applicationRepository;
    private final ApplicationMapper applicationMapper;

    public ApplicationDto createApplication(ApplicationDto applicationDto) {
        if (applicationRepository.findByEmail(applicationDto.getEmail()).isPresent()) {
            throw new DataIntegrityViolationException("Email artıq mövcuddur!");
        }
        if (applicationRepository.findByTelefon(applicationDto.getTelefon()).isPresent()) {
            throw new DataIntegrityViolationException("Telefon nömrəsi artıq mövcuddur!");
        }

        Application application = applicationMapper.toEntity(applicationDto);
        application = applicationRepository.save(application);
        log.info("Yeni Application yaradıldı: {}", application);
        return applicationMapper.toDto(application);
    }

    public Page<ApplicationDto> getAllApplications(Pageable pageable) {

        return applicationRepository.findAll(pageable).map(applicationMapper::toDto);
    }

    public ApplicationDto getApplicationById(Long id) {
        return applicationRepository.findById(id)
                .map(applicationMapper::toDto)
                .orElseThrow(() -> new EntityNotFoundException("Application tapılmadı! ID: " + id));
    }
}



