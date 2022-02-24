package uz.pdp.model.station;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class StationReceiveDTO {
    private String name;

    private String region;

    private String district;
}
