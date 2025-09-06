package models;

import java.util.List;

public class User extends BaseModel {
    private String username;
    private String password;
    private String email;
    private List<Ticket> ticket;
    private List<Payment> payment;
}
