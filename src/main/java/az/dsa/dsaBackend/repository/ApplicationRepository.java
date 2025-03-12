package az.dsa.dsaBackend.repository;

import az.dsa.dsaBackend.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application, Integer> {
}
