package az.dsa.dsaBackend.dto;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BootcampDto {
    private Long bootcampsId;
    private String bootcampsType;
    private Boolean isActive;
    private Integer ordered;
    private String title;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;
    private BigDecimal money;
    private String textIds;
}
