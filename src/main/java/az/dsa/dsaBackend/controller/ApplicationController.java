package az.dsa.dsaBackend.controller;

import az.dsa.dsaBackend.dto.ApplicationDto;
import az.dsa.dsaBackend.entity.Application;
import az.dsa.dsaBackend.service.ApplicationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/applications")
public class ApplicationController {
    private final ApplicationService applicationService;

    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping
    public List<ApplicationDto> getAllApplications() {
        return applicationService.getAllApplications();
    }

    @PostMapping
    public ApplicationDto createApplication(@RequestBody ApplicationDto applicationDto) {
        return applicationService.saveApplication(applicationDto);
    }
}


