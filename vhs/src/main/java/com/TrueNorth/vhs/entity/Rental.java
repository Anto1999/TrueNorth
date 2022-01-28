package com.TrueNorth.vhs.entity;

import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Rental")
public class Rental {
    @Id
    @SequenceGenerator(name = "rental_sequence",
            sequenceName = "rental_sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "rental_sequence")
    private Long rentalId;

    @ManyToOne
    @JoinColumn(name="userId")
    User user;

    @ManyToOne
    @JoinColumn(name = "vhsId")
    Vhs vhs;

    @Column(name = "Rented")
    private LocalDate rented;

    @Column(name = "Returned")
    private LocalDate returned;

    public Rental(User user, Vhs vhs, LocalDate rented, LocalDate returned) {
        this.user = user;
        this.vhs = vhs;
        this.rented = rented;
        this.returned = returned;
    }

    public Rental() {

    }



    public Long getRentalId() {
        return rentalId;
    }

    public void setRentalId(Long rentalId) {
        this.rentalId = rentalId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Vhs getVhs() {
        return vhs;
    }

    public void setVhs(Vhs vhs) {
        this.vhs = vhs;
    }

    public LocalDate getRented() {
        return rented;
    }

    public void setRented(LocalDate rented) {
        this.rented = rented;
    }

    public LocalDate getReturned() {
        return returned;
    }

    public void setReturned(LocalDate returned) {
        this.returned = returned;
    }
}
