package uz.pdp.model.seat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SeatCreateDto {
    @NotNull()
    private String type;
    private int order_number;
}
