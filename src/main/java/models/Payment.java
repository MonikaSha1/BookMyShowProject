package models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import models.constant.TicketStatus;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Payment extends BaseModel {
    private LocalDateTime localDateTime;
    private double amount;
    private String paymentReference;


}
