package uz.pdp.model.wagon;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class WagonCreateDTO {

    @NotNull()
    private String type;

    @NotNull
    private int order_number;

    @NotNull
    private int total_seats;
}