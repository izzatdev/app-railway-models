package uz.pdp.model.train;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.model.schedule.ScheduleResponseDto;
import uz.pdp.model.wagon.WagonResponseDto;

import java.util.List;
import java.util.Set;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class TrainResponseDto {//Trains Response Dto

    private Long id;




    private int count_wagon;

    private int total_seats;

    private String name;

    private double speed;



    private Set<WagonResponseDto> wagons;

    private Set<ScheduleResponseDto> schedules;
}

