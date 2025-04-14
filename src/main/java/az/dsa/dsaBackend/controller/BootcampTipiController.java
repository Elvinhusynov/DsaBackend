package az.dsa.dsaBackend.controller;
import az.dsa.dsaBackend.dto.BootcampTipiDTO;
import az.dsa.dsaBackend.service.BootcampTipiService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bootcamp-tipleri")
@RequiredArgsConstructor
public class BootcampTipiController {
    private final BootcampTipiService service;

    @GetMapping
    public ResponseEntity<List<BootcampTipiDTO>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<BootcampTipiDTO> getById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @PostMapping
    public ResponseEntity<BootcampTipiDTO> create(@RequestBody BootcampTipiDTO dto) {
        return ResponseEntity.ok(service.create(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<BootcampTipiDTO> update(
            @PathVariable Long id,
            @RequestBody BootcampTipiDTO dto) {
        return ResponseEntity.ok(service.update(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
