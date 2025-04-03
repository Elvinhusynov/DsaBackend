package az.dsa.dsaBackend.dao;

import az.dsa.dsaBackend.entity.Application;
import az.dsa.dsaBackend.repository.ApplicationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
@RequiredArgsConstructor

public class UserDaoJpa implements ApplicationDao{
    private final ApplicationRepository applicationRepository;

    @Override
    public Application save(Application application) {
        return null;
    }

    @Override
    public Optional<Application> findById(int id) {
        return Optional.empty();
    }

    @Override
    public void delete(int id) {

    }
}
