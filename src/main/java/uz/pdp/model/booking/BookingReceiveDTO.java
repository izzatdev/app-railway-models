package uz.pdp.model.booking;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookingReceiveDTO {

    private Long statusId;

    private double totalPrice;

    private double singlePrice;

    private Long userId;

    private Long scheduleId;

    private Long fromStationId;

    private Long toStationId;

    private LocalDateTime startTime;

    private LocalDateTime endTime;
}
