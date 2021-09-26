package one.digitalinnovation.personapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {

    private Long id;

    @NotEmpty
    @Size(min = 2, max = 100)
    @Valid
    private String firstName;

    @NotEmpty
    @Size(min = 2, max = 100)
    @Valid
    private String lastName;

    @NotEmpty
    @CPF
    @Size(min = 11, max = 11)
    @Valid
    private String cpf;

    @NotEmpty
    @Valid
    private String birthDate;

    @NotEmpty
    @Valid
    private List<PhoneDTO> phones;

}
