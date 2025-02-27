package com.example.demo.DTO;

public class AddressBookDTO {
    public String name;
    public String address;
    public long phnNumber;
    public String city;

    public AddressBookDTO(String name, String address, long phnNumber, String city){
        this.name=name;
        this.address=address;
        this.phnNumber=phnNumber;
        this.city=city;
    }
    public String toString(){
        return "Name is " + name + "Address is : " + "PhoneNumber is : " + phnNumber + "city is " + city;
    }
}
