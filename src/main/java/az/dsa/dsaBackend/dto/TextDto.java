package az.dsa.dsaBackend.dto;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class TextDto {
    private String textId;
    private Integer sessionNumber;
    private LocalDate date;
    private String hour;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String texts;
}
