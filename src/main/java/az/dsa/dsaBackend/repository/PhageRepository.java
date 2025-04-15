package az.dsa.dsaBackend.repository;

import az.dsa.dsaBackend.entity.Phage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhageRepository extends JpaRepository<Phage, Long>{
}
