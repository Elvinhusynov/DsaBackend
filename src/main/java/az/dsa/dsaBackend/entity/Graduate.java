package az.dsa.dsaBackend.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "graduates")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Graduate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "graduate_id")
    private Long graduateId;

    private String image;
    private String name;

    @Column(name = "work_position")
    private String workPosition;

    @Column(name = "work_location")
    private String workLocation;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "update_at")
    private LocalDateTime updateAt;
}
