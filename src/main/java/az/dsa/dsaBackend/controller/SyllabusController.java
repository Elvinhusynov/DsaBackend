package az.dsa.dsaBackend.controller;

import az.dsa.dsaBackend.dto.SyllabusDto;
import az.dsa.dsaBackend.service.SyllabusService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/syllabuses")
@RequiredArgsConstructor
public class SyllabusController {
    private final SyllabusService syllabusService;

    @GetMapping
    public ResponseEntity<List<SyllabusDto>> getAll() {
        return ResponseEntity.ok(syllabusService.getAllSyllabuses());
    }

    @PostMapping
    public ResponseEntity<SyllabusDto> create(@RequestBody SyllabusDto dto) {
        return ResponseEntity.ok(syllabusService.createSyllabus(dto));
    }
    @GetMapping("/{id}")
    public ResponseEntity<SyllabusDto> getById(@PathVariable Long id) {
        return ResponseEntity.ok(syllabusService.getById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<SyllabusDto> update(
            @PathVariable Long id,
            @RequestBody SyllabusDto dto
    ) {
        return ResponseEntity.ok(syllabusService.updateSyllabus(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        syllabusService.deleteSyllabus(id);
        return ResponseEntity.noContent().build();
    }
}
