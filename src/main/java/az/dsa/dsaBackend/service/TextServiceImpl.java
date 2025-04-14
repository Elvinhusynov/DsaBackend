package az.dsa.dsaBackend.service;

import az.dsa.dsaBackend.entity.Text;
import az.dsa.dsaBackend.repository.TextsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TextServiceImpl implements TextService{
    private final TextsRepository repository;

    @Override
    public Text save(Text texts) {
        return repository.save(texts);
    }

    @Override
    public List<Text> getAll() {
        return repository.findAll();
    }

    @Override
    public Text getById(String id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}
