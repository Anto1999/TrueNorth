package com.TrueNorth.vhs.request;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

public class VhsRequest {
    @NotBlank
    private String title;
    @NotBlank
    private LocalDate published;
    @NotBlank
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
