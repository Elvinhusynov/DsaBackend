package az.dsa.dsaBackend.repository;

import az.dsa.dsaBackend.entity.Graduate;
import org.springframework.data.jpa.repository.JpaRepository;
public interface GraduateRepository extends JpaRepository<Graduate, Long> {
}
