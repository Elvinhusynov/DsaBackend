package az.dsa.dsaBackend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

@Entity
@Table(name = "sessions")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sessionId;

    private String sessionNumber;

    private LocalDate date;

    private LocalTime hour;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    @Lob
    private String texts;
}
