package uz.pdp.model.price;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PriceReceiveDTO {
    private double price;

    private double distance;

    private long fromStationId;

    private long toStationId;

    private long wagonId;
}
