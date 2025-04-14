package az.dsa.dsaBackend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "trainings")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Training {
    @Id
    @Column(name = "trainings_id")
    private String trainingsId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bootcamps_id", referencedColumnName = "bootcamps_id")
    private Bootcamp bootcamp;

    @Column(name = "is_active")
    private Boolean isActive;

    @Column(name = "`order`")
    private Integer order;

    @Column(name = "title")
    private String title;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "money")
    private BigDecimal money;

    @Column(name = "metnler_ids")
    private String metnlerIds;
}
