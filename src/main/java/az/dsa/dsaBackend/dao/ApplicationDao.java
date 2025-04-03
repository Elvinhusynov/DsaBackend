package az.dsa.dsaBackend.dao;

import az.dsa.dsaBackend.entity.Application;

import java.util.Optional;

public interface ApplicationDao {

    Application save(Application application);

    Optional<Application> findById(int id);

    void delete(int id);
}
