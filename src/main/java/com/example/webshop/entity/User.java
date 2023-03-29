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

    @Column(name = "is_enabled")
    boolean isEnabled;

    @Column(name = "password")
    String password;

    public User() {
    }

    public User(int id, String userName, boolean isEnabled, String password) {
        this.id = id;
        this.password = password;
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

    public boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", isEnabled=" + isEnabled +
                ", password='" + password + '\'' +
                '}';
    }
}
