package az.dsa.dsaBackend.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SyllabusDto {
    private Long syllabusId;
    private String title;
    private String description;
    private String label;
    private String information;
    private String metinler;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
