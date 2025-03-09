package com.example.demo.model;

import com.example.demo.DTO.AddressBookDTO;

public class AddressBookData {
    private int idNo;
    private String name;
    private String address;
    private long phnNumber;
    private String city;

    // Default Constructor
    public AddressBookData() {}

    // Parameterized Constructor using DTO
    public AddressBookData(int idNo, AddressBookDTO addressBookDTO) {
        this.idNo = idNo;
        this.name = addressBookDTO.getName();
        this.address = addressBookDTO.getAddress();
        this.phnNumber = addressBookDTO.getPhnNumber();
        this.city = addressBookDTO.getCity();
    }

    // Getters & Setters
    public int getIdNo() {
        return idNo;
    }

    public void setIdNo(int idNo) {
        this.idNo = idNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhnNumber() {
        return phnNumber;
    }

    public void setPhnNumber(long phnNumber) {
        this.phnNumber = phnNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // Overriding toString() for debugging
    @Override
    public String toString() {
        return "AddressBookData{" +
                "idNo=" + idNo +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phnNumber=" + phnNumber +
                ", city='" + city + '\'' +
                '}';
    }
}
