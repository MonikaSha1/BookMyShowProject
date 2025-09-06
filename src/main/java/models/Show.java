package models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import models.constant.SeatStatus;
import models.constant.ShowStatus;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Show extends BaseModel {
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private String language;

    @ManyToOne
    private Auditorium auditorium;
    @OneToMany
    private List<ShowSeat> showSeat;
    @ManyToOne
    private Movie movie;
    @Enumerated(EnumType.STRING)
    private ShowStatus showStatus;


}
