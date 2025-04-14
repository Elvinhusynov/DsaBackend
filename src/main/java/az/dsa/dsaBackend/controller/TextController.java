package az.dsa.dsaBackend.controller;

import az.dsa.dsaBackend.entity.Text;
import az.dsa.dsaBackend.service.TextService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/texts")
@RequiredArgsConstructor
public class TextController {

    private final TextService service;

    @PostMapping
    public Text create(@RequestBody Text texts) {
        return service.save(texts);
    }

    @GetMapping
    public List<Text> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Text getById(@PathVariable String id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
