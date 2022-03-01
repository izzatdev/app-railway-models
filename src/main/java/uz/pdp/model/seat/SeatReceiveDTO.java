package uz.pdp.model.seat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SeatReceiveDTO {

    private String type;

    private int order_number;

    private int wagonId;
}
