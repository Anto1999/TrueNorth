package com.TrueNorth.vhs.request;

import java.time.LocalDate;

public class VhsRequest {
    private String title;
    private LocalDate published;
    private boolean is_rental;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getPublished() {
        return published;
    }

    public void setPublished(LocalDate published) {
        this.published = published;
    }

    public boolean isIs_rental() {
        return is_rental;
    }

    public void setIs_rental(boolean is_rental) {
        this.is_rental = is_rental;
    }
}
