package az.dsa.dsaBackend.repository;

import az.dsa.dsaBackend.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Long>, PagingAndSortingRepository<Application, Long> {
    Optional<Application> findByEmail(String email);
    Optional<Application> findByTelefon(String telefon);
}
