package uz.pdp.model.wagon;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class WagonReceiveDTO {
    private String type;

    private int order_number;

    private int total_seats;

    private int free_seats;

    private int trainId;
}
