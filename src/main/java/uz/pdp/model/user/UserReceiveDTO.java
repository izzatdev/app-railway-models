package uz.pdp.model.user;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserReceiveDTO {
    private String email;

    private String password;

    @Size(min = 13, max = 14)
    @NotNull
    @JsonProperty("phone_number")
    private String phoneNumber;

    @NotBlank(message = "first name must not be empty")
    @JsonProperty("first_name")
    private String firstName;

    @NotBlank(message = "last name must not be empty")
    @JsonProperty("last_name")
    private String lastName;

    private String fatherName; //patronymic

    @NotNull
    private String roleName;//enum

    @NotNull
    private String documentType;//enum

    @NotNull
    private String documentNumber;

    @NotNull
    private String districtName;

    @NotNull
    private boolean gender;

    @NotNull
    private Date birthDate;


    private boolean isActive;

    @NotNull
    private long countryId;

    @NotNull
    private long districtId;
}
