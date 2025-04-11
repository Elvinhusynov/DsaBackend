package az.dsa.dsaBackend.service;

import az.dsa.dsaBackend.dto.ContactDto;
import az.dsa.dsaBackend.entity.Contact;
import az.dsa.dsaBackend.exception.ContactNotFoundException;
import az.dsa.dsaBackend.mapper.ContactMapper;
import az.dsa.dsaBackend.repository.ContactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ContactService {
    private final ContactRepository repository;
    private final ContactMapper mapper;

    public ContactDto createContact(ContactDto dto) {
        Contact contact = mapper.toEntity(dto);
        return mapper.toDto(repository.save(contact));
    }

    public List<ContactDto> getAllContacts() {
        return repository.findAll().stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    public ContactDto getContactById(Long id) {
        Contact contact = repository.findById(id)
                .orElseThrow(() -> new ContactNotFoundException("Contact not found with ID: " + id));
        return mapper.toDto(contact);
    }

    public void deleteContact(Long id) {
        if (!repository.existsById(id)) {
            throw new ContactNotFoundException("Contact not found with ID: " + id);
        }
        repository.deleteById(id);
    }
}
