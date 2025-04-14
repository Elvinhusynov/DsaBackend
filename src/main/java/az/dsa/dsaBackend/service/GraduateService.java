package az.dsa.dsaBackend.service;

import az.dsa.dsaBackend.dto.GraduateDto;

import java.util.List;

public interface GraduateService {

    GraduateDto createGraduate(GraduateDto graduateDto);

    List<GraduateDto> getAllGraduate();

    GraduateDto getGraduateById(Long id);

    GraduateDto updateGraduate(Long id, GraduateDto graduateDto);

    void deleteGraduate(Long id);
}
