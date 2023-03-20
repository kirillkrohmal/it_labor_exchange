package com.example.webshop.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "resume")
public class Resume {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @OneToOne(mappedBy = "users")
    User user;

    public Resume() {
    }

    public Resume(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
