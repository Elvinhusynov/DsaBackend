package az.dsa.dsaBackend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "bootcamp")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Bootcamp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bootcamps_id")
    private Long bootcampsId;

    private String bootcampsType;

    private Boolean isActive;

    private Integer ordered;

    private String title;

    private LocalDateTime createdAt;

    private LocalDateTime updateAt;

    private BigDecimal money;

    private String textIds; // əgər çoxlu id olacaqsa, List kimi saxlayıb converter istifadə edə bilərik
}

