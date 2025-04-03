package az.dsa.dsaBackend.controller;

import az.dsa.dsaBackend.dto.ApplicationDto;
import az.dsa.dsaBackend.service.ApplicationService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("api/v1/applications")
@RequiredArgsConstructor

public class ApplicationController {
    private final ApplicationService applicationService;

    @PostMapping
    public ResponseEntity<ApplicationDto> createApplication(@RequestBody @Valid ApplicationDto applicationDto) {
        log.info("Yeni application request gəldi: {}", applicationDto);

        return ResponseEntity.status(HttpStatus.CREATED).
                body(applicationService.createApplication(applicationDto));
    }

    @GetMapping
    public ResponseEntity<Page<ApplicationDto>> getAllApplications(Pageable pageable) {

        return ResponseEntity.ok(applicationService.getAllApplications(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApplicationDto> getApplicationById(@PathVariable Long id) {
        log.info("Application axtarılır: ID={}", id);

        return ResponseEntity.ok(applicationService.getApplicationById(id));

    }
}


