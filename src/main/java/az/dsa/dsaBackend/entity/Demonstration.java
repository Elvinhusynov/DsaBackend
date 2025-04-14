package az.dsa.dsaBackend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "demonstrations")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Demonstration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long demonstrationsId;

    private String title;

    private String info;

    private String link;

    private String trainer;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    @Lob
    private String texts;
}
