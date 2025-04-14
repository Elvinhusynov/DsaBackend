package az.dsa.dsaBackend.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GraduateDto {
    private Long graduateId;
    private String image;
    private String name;
    private String workPosition;
    private String workLocation;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;
}
