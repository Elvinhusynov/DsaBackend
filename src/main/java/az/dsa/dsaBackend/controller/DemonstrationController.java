package az.dsa.dsaBackend.controller;

import az.dsa.dsaBackend.entity.Demonstration;
import az.dsa.dsaBackend.service.DemonstrationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/demonstrations")
@RequiredArgsConstructor
public class DemonstrationController {
    private final DemonstrationService demonstrationService;

    @GetMapping
    public ResponseEntity<List<Demonstration>> getAll() {
        return ResponseEntity.ok(demonstrationService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Demonstration> getById(@PathVariable Long id) {
        return demonstrationService.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Demonstration> create(@RequestBody Demonstration demonstration) {
        return ResponseEntity.ok(demonstrationService.create(demonstration));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        demonstrationService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
