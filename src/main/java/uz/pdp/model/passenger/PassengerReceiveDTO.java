package uz.pdp.model.passenger;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PassengerReceiveDTO {
    private String firstName;

    private String lastName;

    private String patronymic; //fatherName

    private String documentType;


    private String documentSeriesNumber;

    private String docGivenDistrictName;

    private boolean gender;

    private Date birthDate;

    private Long countryId;
}
