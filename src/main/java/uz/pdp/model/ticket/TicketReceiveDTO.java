package uz.pdp.model.ticket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TicketReceiveDTO {
    private Long statusId;

    private Long bookingId;

    private Long passengerId;

    private Long seatId;
}
