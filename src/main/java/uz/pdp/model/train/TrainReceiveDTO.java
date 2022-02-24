package uz.pdp.model.train;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TrainReceiveDTO {

    private String name;

    private int count_wagon;

    private int free_seats;

    private double speed;

    private long scheduleId;
}
