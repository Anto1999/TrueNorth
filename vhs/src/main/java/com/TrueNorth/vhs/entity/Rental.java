package com.TrueNorth.vhs.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
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
    @Column(name="rental_id")
    private Long rentalId;

    @ManyToOne
    @JoinColumn(name="user_id")
    User user;

    @ManyToOne
    @JoinColumn(name = "vhs_id")
    Vhs vhs;

    @Column(name = "Rented")
    private LocalDate rented=LocalDate.now();

    @Column(name = "Returned")
    private LocalDate returned=LocalDate.now().plusDays(14);

    public Rental(){}


    @JsonCreator
    public Rental(@JsonProperty("user_id") User user,@JsonProperty("vhs_id") Vhs vhs, LocalDate rented, LocalDate returned) {
        vhs.setIs_rental(true);
        this.user = user;
        this.vhs = vhs;
        this.rented = rented;
        this.returned = returned;

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

    public void setVhs(Vhs vhs ) {
        this.vhs=vhs;

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
