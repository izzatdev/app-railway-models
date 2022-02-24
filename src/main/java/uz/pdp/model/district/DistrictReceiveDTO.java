package uz.pdp.model.district;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DistrictReceiveDTO {
    private String name;
    private long countryId;
}
