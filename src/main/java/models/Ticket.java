package models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import models.constant.TicketStatus;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Ticket extends BaseModel{
    private long ticketPrice;
    @OneToMany
    private List<ShowSeat> seats;
    @ManyToOne
    private Show show;
    @ManyToOne
    private User user;
    private LocalDateTime localDateTime;
    private TicketStatus ticketStatus;
}
