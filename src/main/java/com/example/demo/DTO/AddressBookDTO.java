package com.example.demo.DTO;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class AddressBookDTO {
    @NotNull(message="Name cannot be null")
    @Pattern(regexp="^[A-Z]{1}[a-zA-Z\\s]{2,}$",message="Employee name Invalid")
    private String name;
    private String address;
    private long phnNumber;
    private String city;

    // Default constructor (needed for JSON conversion)
    public AddressBookDTO() {}

    // Parameterized constructor
    public AddressBookDTO(String name, String address, long phnNumber, String city) {
        this.name = name;
        this.address = address;
        this.phnNumber = phnNumber;
        this.city = city;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public long getPhnNumber() {
        return phnNumber;
    }

    public String getCity() {
        return city;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhnNumber(long phnNumber) {
        this.phnNumber = phnNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // toString method for debugging
    @Override
    public String toString() {
        return "Name: " + name + ", Address: " + address + ", Phone Number: " + phnNumber + ", City: " + city;
    }
}
