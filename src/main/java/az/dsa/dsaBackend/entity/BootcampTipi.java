package az.dsa.dsaBackend.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "Bootcamptipi")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
    public class BootcampTipi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Bootcamptipi_id")
    private Long id;

    @Column(name = "Bootcamp_tipi", nullable = false)
    private String bootcampTipi;

    @Column(name = "is_active")
    private Boolean isActive = true;

    @Column(name = "`order`")
    private Integer order;

    @Column(nullable = false)
    private String title;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    private Double money;

    @Column(name = "metinler_ids")
    private String metinlerIds;

}
