package az.dsa.dsaBackend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "contact")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contactId;

    private String name;
    private String surname;
    private String email;
    private String phone;
    private String message;

    private LocalDateTime createdAt;
    private LocalDateTime updateAt;
}


