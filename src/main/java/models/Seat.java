package models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;
import models.constant.SeatStatus;
import models.constant.SeatType;

@Getter
@Setter
@Entity
public class Seat extends BaseModel {
    private int row;
    private int column;
    private int seatNumber;
    @Enumerated(EnumType.STRING)
    private SeatType seatType;
    @Enumerated(EnumType.STRING)
    private SeatStatus seatStatus;
}
