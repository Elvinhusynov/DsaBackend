package az.dsa.dsaBackend.service;

import az.dsa.dsaBackend.dto.PhageDTO;

import java.util.List;

public interface PhageService {
    List<PhageDTO> getAllPhages();

    PhageDTO getPhageById(Long id);

    PhageDTO createPhage(PhageDTO phageDTO);

    void deletePhage(Long id);
}
