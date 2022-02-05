package com.TrueNorth.vhs.entity;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.springframework.asm.Type;
import org.springframework.cglib.core.CodeEmitter;
import org.springframework.cglib.core.HashCodeCustomizer;

import javax.persistence.*;
import java.time.LocalDate;
import java.lang.Object;

@Entity
@Table(name = "Vhs")
public class Vhs {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    public Vhs(Long vhsId, String title, LocalDate published) {

        this.title = title;
        this.published = published;

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

    @Override
    public int hashCode(){
        HashCodeBuilder hcb = new HashCodeBuilder();
        hcb.append(title)
                .append(published);
        return hcb.toHashCode();
    }

    @Override
    public boolean equals(Object obj ){
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Vhs)){
            return false;
        }
        Vhs that = (Vhs) obj;
        EqualsBuilder eb = new EqualsBuilder();
        eb.append(title,that.title)
                .append(published,that.published);
        return eb.isEquals();
    }




    @Override
    public String toString() {
        return "Vhs{" +
                "vhsId=" + vhsId +
                ", title='" + title + '\'' +
                ", published=" + published +
                ", is_rental=" + is_rental +
                '}';
    }
}


