package az.dsa.dsaBackend.repository;

import az.dsa.dsaBackend.entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
public interface RegistrationRepository extends JpaRepository<Registration, Long>{
    Optional<Registration> findByEmail(String email);
    boolean existsByEmail(String email);
}
