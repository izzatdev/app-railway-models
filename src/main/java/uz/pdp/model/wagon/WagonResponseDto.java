package uz.pdp.model.wagon;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class WagonResponseDto {

    private Long id;

    private String type;

    private int order_number;

    private int total_seats;
}
