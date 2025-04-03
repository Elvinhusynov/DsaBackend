package az.dsa.dsaBackend.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApplicationDto {

    private Long applicationId;

    @NotBlank(message = "Ad boş ola bilməz")
    private String ad;

    @NotBlank(message = "Soyad boş ola bilməz")
    private String soyad;

    @NotBlank(message = "Email boş ola bilməz")
    @Email(message = "Email formatı yanlışdır")
    private String email;

    @NotBlank(message = "Telefon nömrəsi boş ola bilməz")
    @Pattern(regexp = "\\+994[0-9]{9}", message = "Telefon formatı yanlışdır (+994xxxxxxxxx)")
    private String telefon;

}
