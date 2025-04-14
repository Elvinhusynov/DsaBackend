package az.dsa.dsaBackend.repository;

import az.dsa.dsaBackend.entity.BootcampTipi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BootcampTipiRepository extends JpaRepository<BootcampTipi, Long> {
    boolean existsByBootcampTipi(String bootcampTipi);
}
