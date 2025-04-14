package az.dsa.dsaBackend.service;

import az.dsa.dsaBackend.entity.Training;
import java.util.List;
public interface TrainingService {

    Training save(Training training);

    List<Training> getAll();

    Training getById(String id);

    void delete(String id);
}
