package az.dsa.dsaBackend.controller;

import az.dsa.dsaBackend.dto.PhageDTO;
import az.dsa.dsaBackend.service.PhageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/phages")
@RequiredArgsConstructor
public class PhageController {
    private final PhageService phageService;

    @GetMapping
    public List<PhageDTO> getAll() {
        return phageService.getAllPhages();
    }

    @GetMapping("/{id}")
    public PhageDTO getById(@PathVariable Long id) {
        return phageService.getPhageById(id);
    }

    @PostMapping
    public PhageDTO create(@RequestBody PhageDTO phageDTO) {
        return phageService.createPhage(phageDTO);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        phageService.deletePhage(id);
    }
}
