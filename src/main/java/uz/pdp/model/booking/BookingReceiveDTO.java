package uz.pdp.model.booking;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookingReceiveDTO {

    private long statusId;

    private double totalPrice;

    private double singlePrice;

    private long userId;

    private long scheduleId;

    private long fromStationId;

    private long toStationId;

    private LocalDateTime startTime;

    private LocalDateTime endTime;
}
