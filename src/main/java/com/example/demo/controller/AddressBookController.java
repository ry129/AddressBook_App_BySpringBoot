package com.example.demo.controller;

import com.example.demo.DTO.AddressBookDTO;
import com.example.demo.DTO.ResponseDTO;
import com.example.demo.Service.IAddressBookService;
import com.example.demo.model.AddressBookData;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/addressbook")  // Base URL for all endpoints
public class AddressBookController {

    @Autowired
    private IAddressBookService addressBookService;

    @GetMapping("/get")
    public ResponseEntity<ResponseDTO> getAddressBook() {
        List<AddressBookData> addData = addressBookService.getAddressBookData();
        ResponseDTO respDto = new ResponseDTO("Successful", addData);
        return new ResponseEntity<>(respDto, HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<ResponseDTO> getAddressBookById(@PathVariable("id") int id) {
        AddressBookData addData = addressBookService.getAddressBookDataById(id);
        ResponseDTO respDto = new ResponseDTO("Successful with id", addData);
        return new ResponseEntity<>(respDto, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> createAddressBook(@Valid @RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addData = addressBookService.createAddressBookData(addressBookDTO);
        ResponseDTO respDto = new ResponseDTO("Successful", addData);
        return new ResponseEntity<>(respDto, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ResponseDTO> updateAddressBook(@PathVariable("id") int id, @RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addData = addressBookService.updateAddressBookData(id, addressBookDTO);
        ResponseDTO respDto = new ResponseDTO("Updated Successfully", addData);
        return new ResponseEntity<>(respDto, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDTO> deleteAddressBook(@PathVariable("id") int id) {
        addressBookService.deleteAddressBookData(id);
        ResponseDTO respDto = new ResponseDTO("Deleted Successfully with ID: " + id, null);
        return new ResponseEntity<>(respDto, HttpStatus.OK);
    }
}