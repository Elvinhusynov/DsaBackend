package az.dsa.dsaBackend.repository;

import az.dsa.dsaBackend.entity.Text;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TextsRepository extends JpaRepository<Text, String>{
}
