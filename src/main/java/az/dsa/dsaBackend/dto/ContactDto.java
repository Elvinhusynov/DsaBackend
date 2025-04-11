package az.dsa.dsaBackend.dto;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ContactDto {

    @NotBlank(message = "Name cannot be empty")
    private String name;

    @NotBlank(message = "Surname cannot be empty")
    private String surname;

    @Email(message = "Invalid email format")
    @NotBlank(message = "Email cannot be empty")
    private String email;

    @NotBlank(message = "Phone cannot be empty")
    @Pattern(regexp = "^(\\+994|0)(50|51|55|70|77)[0-9]{7}$", message = "Invalid phone number")
    private String phone;

    @NotBlank(message = "Message cannot be empty")
    private String message;
}
