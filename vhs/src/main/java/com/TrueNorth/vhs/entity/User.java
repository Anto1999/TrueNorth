package com.TrueNorth.vhs.entity;

import com.TrueNorth.vhs.permission.Role;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Users")
public class User {
    @Id
    @SequenceGenerator(name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "user_sequence")
    @Column(name = "userId")
    private Long userId;

    @Column(name="username")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name="role")
    private Role role;

    @Column(name="password")
    private String password;

    @OneToMany
    @Column(name="userVHS")
    private List<Vhs> vhsList;

    public User() {
    }

    public User(String username, String email, Role role,String password) {
        this.username = username;
        this.email = email;
        this.role = role;
        this.password=password;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Vhs> getVhsList() {
        return vhsList;
    }

    public void setVhsList(List<Vhs> vhsList) {
        this.vhsList = vhsList;
    }
}
