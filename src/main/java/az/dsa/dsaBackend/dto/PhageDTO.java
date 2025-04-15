package az.dsa.dsaBackend.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PhageDTO {
    private Long id;
    private String question;
    private String answer;
    private String questionEn;
    private String answerEn;
}
