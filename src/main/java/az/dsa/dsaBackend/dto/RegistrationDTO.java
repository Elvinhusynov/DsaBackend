package az.dsa.dsaBackend.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class RegistrationDTO {
    private Long id;
    private String fullName;
    private String email;
    private String phone;
    private LocalDateTime eventDate;
}
