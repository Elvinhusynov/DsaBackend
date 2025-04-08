package az.dsa.dsaBackend.controller;

import az.dsa.dsaBackend.dto.BootcampDto;
import az.dsa.dsaBackend.service.BootcampService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bootcamps")
@RequiredArgsConstructor
public class BootcampController {
    private final BootcampService service;

    @GetMapping
    public List<BootcampDto> getAll() {
        return service.getAllBootcamps();
    }

    @GetMapping("/{id}")
    public BootcampDto getById(@PathVariable Long id) {
        return service.getBootcampById(id);
    }

    @PostMapping
    public BootcampDto create(@RequestBody BootcampDto dto) {
        return service.createBootcamp(dto);
    }

    @PutMapping("/{id}")
    public BootcampDto update(@PathVariable Long id, @RequestBody BootcampDto dto) {
        return service.updateBootcamp(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteBootcamp(id);
    }
}

