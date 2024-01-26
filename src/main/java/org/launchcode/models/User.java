package org.launchcode.models;

import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {

    @NotNull
    @Size(min = 5, max = 15, message = "Username must be between 5 and 15 characters.")
    private String username;

    @Email(message = "Invalid email address format.")
    private String email;

    @NotNull
    @Size(min = 6, message = "Password must be at least 6 characters long.")
    private String password;

    // Constructors

    // Default constructor
    public User() {
    }

    // Parameterized constructor
    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    // Getter and setter methods

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
