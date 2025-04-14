package az.dsa.dsaBackend.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class DemonstrationDto {
    private Long demonstrationsId;
    private String title;
    private String info;
    private String link;
    private String trainer;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String texts;
}
