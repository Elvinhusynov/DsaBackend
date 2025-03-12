package az.dsa.dsaBackend.service;

import az.dsa.dsaBackend.dto.ApplicationDto;
import az.dsa.dsaBackend.entity.Application;
import az.dsa.dsaBackend.mapper.ApplicationMapper;
import az.dsa.dsaBackend.repository.ApplicationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ApplicationService {
    private final ApplicationRepository applicationRepository;
    private final ApplicationMapper applicationMapper = ApplicationMapper.INSTANCE;

    public ApplicationService(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    public List<ApplicationDto> getAllApplications() {
        return applicationRepository.findAll()
                .stream()
                .map(applicationMapper::toDto)
                .collect(Collectors.toList());
    }

    public ApplicationDto saveApplication(ApplicationDto applicationDto) {
        Application application = applicationMapper.toEntity(applicationDto);
        Application savedApplication = applicationRepository.save(application);
        return applicationMapper.toDto(savedApplication);
    }
}


