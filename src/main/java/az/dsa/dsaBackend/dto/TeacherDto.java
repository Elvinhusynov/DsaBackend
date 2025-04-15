package az.dsa.dsaBackend.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TeacherDto {
    private Long teacherId;
    private String image;
    private String info;
    private String name;
    private String workPosition;
    private String workLocation;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
