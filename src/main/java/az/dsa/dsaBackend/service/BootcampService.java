package az.dsa.dsaBackend.service;

import az.dsa.dsaBackend.dto.BootcampDto;
import java.util.List;
public interface BootcampService {
    List<BootcampDto> getAllBootcamps();

    BootcampDto getBootcampById(Long id);

    BootcampDto createBootcamp(BootcampDto dto);

    BootcampDto updateBootcamp(Long id, BootcampDto dto);

    void deleteBootcamp(Long id);
}
