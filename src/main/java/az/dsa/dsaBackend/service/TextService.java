package az.dsa.dsaBackend.service;

import az.dsa.dsaBackend.entity.Text;
import java.util.List;

public interface TextService {

    Text save(Text texts);
    List<Text> getAll();
    Text getById(String id);
    void delete(String id);
}
