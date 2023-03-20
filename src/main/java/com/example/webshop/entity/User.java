package com.example.webshop.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "username")
    String userName;

    @Column(name = "isenabled")
    boolean isEnabled;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="resume_id")
    Resume resume;

    public User() {
    }

    public User(int id, String userName, boolean isEnabled) {
        this.id = id;
        this.userName = userName;
        this.isEnabled = isEnabled;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public Resume getResume() {
        return resume;
    }

    public void setResume(Resume resume) {
        this.resume = resume;
    }
}
