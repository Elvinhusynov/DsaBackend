package az.dsa.dsaBackend.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "phage")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Phage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "phage_id")
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String question;

    @Column(columnDefinition = "TEXT")
    private String answer;

    @Column(name = "question_en", columnDefinition = "TEXT")
    private String questionEn;

    @Column(name = "answer_en", columnDefinition = "TEXT")
    private String answerEn;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = LocalDateTime.now();
    }
}
