package com.TrueNorth.vhs.request;

import java.time.LocalDate;

public class VhsRequest {
    private String title;
    private LocalDate published;

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
}
