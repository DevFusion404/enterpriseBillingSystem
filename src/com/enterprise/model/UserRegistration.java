package com.enterprise.model;

public class UserRegistration {
    public void registerUser(String firstName, String lastName, String email, int age, String country, String role) {
        System.out.println("User: " + firstName + " " + lastName + " email: " + email);
    }

    public void signup() {
        registerUser("Alice", "Smith", "alice@example.com", 25, "Canada", "admin");
    }

    public static void main(String[] args) {
        UserRegistration reg = new UserRegistration();
        reg.signup();
    }
}
