package az.dsa.dsaBackend.repository;

import az.dsa.dsaBackend.entity.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
