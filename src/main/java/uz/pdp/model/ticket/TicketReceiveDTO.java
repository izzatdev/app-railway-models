package uz.pdp.model.ticket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TicketReceiveDTO {
    private long statusId;

    private long bookingId;

    private long passengerId;

    private long seatId;
}
