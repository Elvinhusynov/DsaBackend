package az.dsa.dsaBackend.repository;

import az.dsa.dsaBackend.entity.Training;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingRepository  extends JpaRepository<Training, String>{
}
