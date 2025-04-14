package az.dsa.dsaBackend.service;

import az.dsa.dsaBackend.entity.Session;
import az.dsa.dsaBackend.repository.SessionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SessionService {
    private final SessionRepository sessionRepository;

    public List<Session> getAll() {
        return sessionRepository.findAll();
    }

    public Optional<Session> getById(Long id) {
        return sessionRepository.findById(id);
    }

    public Session create(Session session) {
        return sessionRepository.save(session);
    }

    public void delete(Long id) {
        sessionRepository.deleteById(id);
    }
}
