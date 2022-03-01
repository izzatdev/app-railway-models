package uz.pdp.model.country;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CountryCreateDto {
    @NotBlank(message = "name may not be empty")
    private String name;

//    @NotBlank(message = "name may not be empty")
//    private String districtName;
}
