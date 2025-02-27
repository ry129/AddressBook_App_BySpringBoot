package com.example.demo.controller;

import com.example.demo.DTO.AddressBookDTO;
import com.example.demo.DTO.ResponseDTO;
import com.example.demo.Service.IAddressBookService;
import com.example.demo.model.AddressBookData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController

public class AddressBookController {
    @Autowired
    private IAddressBookService addressBookService;
    @RequestMapping("/")
    public ResponseEntity<ResponseDTO> getaddressbook(){
        List<AddressBookData> addData=null;
        addData=addressBookService.getAddressBookData();
        ResponseDTO respDto=new ResponseDTO("Successfull",addData);
        return new ResponseEntity<ResponseDTO>(respDto,HttpStatus.OK);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<ResponseDTO> getaddressbookId(@PathVariable("id")int id){
        AddressBookData addData=null;
        addData=addressBookService.getAddressBookDataById(id);
        ResponseDTO respDto=new ResponseDTO("Successfull with id",addData);
        return new ResponseEntity<ResponseDTO>(respDto,HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> createaddressbook(@RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addData = null;
        addData = addressBookService.createAddressBookData(addressBookDTO);
        ResponseDTO respDto = new ResponseDTO("Successfull", addData);
        return new ResponseEntity<ResponseDTO>(respDto, HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<ResponseDTO> updateaddressbook(@RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addData = null;
        addData = addressBookService.updateAddressBookData(addressBookDTO);
        ResponseDTO respDto = new ResponseDTO("Successfull", addData);
        return new ResponseEntity<ResponseDTO>(respDto, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
        public ResponseEntity<ResponseDTO> deleteaddressbok(@PathVariable("id")int id){
        addressBookService.deleteAddressBookData(id);
            ResponseDTO respDto=new ResponseDTO("Success",HttpStatus.OK);
            return new ResponseEntity<ResponseDTO>(respDto,HttpStatus.OK);

        }
    }





