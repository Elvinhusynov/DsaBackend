package az.dsa.dsaBackend.controller;

import az.dsa.dsaBackend.dto.GraduateDto;
import az.dsa.dsaBackend.service.GraduateService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/graduates")
@RequiredArgsConstructor

public class GraduateController {
    private final GraduateService service;

    @PostMapping
    public ResponseEntity<GraduateDto> create(@RequestBody GraduateDto dto) {
        return ResponseEntity.ok(service.createGraduate(dto));
    }

    @GetMapping
    public ResponseEntity<List<GraduateDto>> getAll() {
        return ResponseEntity.ok(service.getAllGraduate());
    }

    @GetMapping("/{id}")
    public ResponseEntity<GraduateDto> getById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getGraduateById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<GraduateDto> update(@PathVariable Long id, @RequestBody GraduateDto dto) {
        return ResponseEntity.ok(service.updateGraduate(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.deleteGraduate(id);
        return ResponseEntity.noContent().build();
    }
}
