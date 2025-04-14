package az.dsa.dsaBackend.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class BootcampTipiDTO {
    private Long id;
    private String bootcampTipi;
    private Boolean isActive;
    private Integer order;
    private String title;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Double money;
    private String metinlerIds;
}
