package uz.pdp.model.travelLine;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TravelLineReceiveDTO {
    private int stationOrder;

    private double stayTime;

    private Long stationId;

    private Long scheduleId;
}
