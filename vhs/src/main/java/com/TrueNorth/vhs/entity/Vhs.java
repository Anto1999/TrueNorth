package com.TrueNorth.vhs.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Vhs")
public class Vhs {
    @Id
    @SequenceGenerator(name = "vhs_sequence",
            sequenceName = "vhs_sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "vhs_sequence")
    @Column(name="vhsId")
    private Long vhsId;

    @Column(name = "title")
    private String title;

    @Column(name = "published")
    private LocalDate published;

    @Column(name = "is_rental")
    private boolean is_rental;

    public Vhs() {
    }

    public Vhs(String title, LocalDate published, boolean is_rental) {
        this.title = title;
        this.published = published;
        this.is_rental = is_rental;
    }

    public Long getVhsId() {
        return vhsId;
    }

    public void setVhsId(Long vhsId) {
        this.vhsId = vhsId;
    }

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
