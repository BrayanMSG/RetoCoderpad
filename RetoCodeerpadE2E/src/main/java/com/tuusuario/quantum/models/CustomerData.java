package com.tuusuario.quantum.models;

public class CustomerData {

    private String firstName;
    private String lastName;
    private String postalCode;

    public CustomerData() {
    }

    public CustomerData(String firstName, String lastName, String postalCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.postalCode = postalCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}