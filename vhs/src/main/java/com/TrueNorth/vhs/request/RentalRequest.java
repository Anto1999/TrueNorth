package com.TrueNorth.vhs.request;

import com.TrueNorth.vhs.entity.User;
import com.TrueNorth.vhs.entity.Vhs;

import java.time.LocalDate;

public class RentalRequest {
    private User user_id;
    private Vhs vhs_id;
    private LocalDate rental;
    private LocalDate returned;
    private boolean is_rental;

    public User getUser_id() {
        return user_id;
    }

    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }

    public Vhs getVhs_id() {
        return vhs_id;
    }

    public void setVhs_id(Vhs vhs_id) {
        this.vhs_id = vhs_id;
    }

    public LocalDate getRental() {
        return rental;
    }

    public void setRental(LocalDate rental) {
        this.rental = rental;
    }

    public LocalDate getReturned() {
        return returned;
    }

    public void setReturned(LocalDate returned) {
        this.returned = returned;
    }

    public boolean isIs_rental() {
        return is_rental;
    }

    public void setIs_rental(boolean is_rental) {
        this.is_rental = is_rental;
    }
}
