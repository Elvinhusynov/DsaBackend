package az.dsa.dsaBackend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "syllabuses")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Syllabus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long syllabusId;

    private String title;

    private String description;

    private String label;

    private String information;

    private String metinler;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}

