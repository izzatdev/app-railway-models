package uz.pdp.model.schedule;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ScheduleReceiveDTO {

    private LocalDateTime fromTime;

    private double travelTime;

    private LocalDateTime arrivalTime;

    private long fromStationId;

    private long toStationId;

    private long trainId;
}
