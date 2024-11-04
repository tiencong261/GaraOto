package model;

import java.io.Serializable;
import java.sql.Timestamp;

public class Customer implements Serializable {
    private String username;
    private String email;
    private String phoneNumber;
    private String password;
    private String fullName;
    private String reset_token; // Dùng cho Forget Password
    private Timestamp tokenExpiry; // Dùng cho Forget Password

    public Customer(String username, String email, String phoneNumber, String password, String fullName, String reset_token, Timestamp tokenExpiry) {
        this.username = username;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.fullName = fullName;
        this.reset_token = reset_token;
        this.tokenExpiry = tokenExpiry;
    }

    public Customer(String username, String email, String phoneNumber, String password, String fullName) {
        this.username = username;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.fullName = fullName;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getResetToken() {
        return reset_token;
    }

    public void setResetToken(String resetToken) {
        this.reset_token = resetToken;
    }

    public Timestamp getTokenExpiry() {
        return tokenExpiry;
    }

    public void setTokenExpiry(Timestamp tokenExpiry) {
        this.tokenExpiry = tokenExpiry;
    }
}