package com.HomeWorkProject.models;

public class User {

    private String email;
    private String password;
    private String gender;
    private String FirstName;
    private String LastName;
    private String ConfirmPassword;

    public String getFirstName() {
        return FirstName;
    }

    public User setFirstName(String firstName) {
        this.FirstName = firstName;
        return this;
    }

    public String getLastName() {
        return LastName;
    }

    public User setLastName(String lastName) {
        this.LastName = lastName;
        return this;
    }

    public String getConfirmPassword() {
        return ConfirmPassword;
    }

    public User setConfirmPassword(String confirmPassword) {
        this.ConfirmPassword = confirmPassword;
        return this;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public String getGender() {
        return gender;
    }

    public User setGender(String gender) {
        this.gender = gender;
        return this;
    }


}
