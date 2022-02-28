package uz.pdp.model.train;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.model.wagon.WagonCreateDTO;

import javax.validation.constraints.NotNull;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TrainCreatedto {
    @NotNull(message = "name may not be empty")
    private String name;

    @NotNull(message = "speed may not be empty")
    private double speed;

    @NotNull(message = "wagons may not be empty")
    private Set<WagonCreateDTO> wagons;
}