package models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import models.constant.AudotiroumFeatures;

import java.util.List;

@Getter
@Setter
@Entity
public class Auditorium extends BaseModel{
    private String name;
    @OneToMany
    private List<Seats> seats;
    private int capacity;
    @OneToMany
    private List<Shows> shows;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<AudotiroumFeatures> features;

}
