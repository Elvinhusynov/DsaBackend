package az.dsa.dsaBackend.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "texts")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Text {
    @Id
    @Column(name = "text_id")
    private String textId;

    @Column(name = "session_number")
    private Integer sessionNumber;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "hour")
    private String hour;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "texts", columnDefinition = "TEXT")
    private String texts;
}
