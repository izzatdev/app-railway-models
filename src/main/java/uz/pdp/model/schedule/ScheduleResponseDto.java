package uz.pdp.model.schedule;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class ScheduleResponseDto {

    private Long id;

    private LocalDateTime fromTime;

    private double travelTime;

    private LocalDateTime arrivalTime;

    private Long fromStationId;

    private Long toStationId;

    private Long trainId;
}
