package az.dsa.dsaBackend.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TrainerDto {
    private Long trainerId;
    private String image;
    private String trainings;
    private String info;
    private String name;
    private String workLocation;
}
