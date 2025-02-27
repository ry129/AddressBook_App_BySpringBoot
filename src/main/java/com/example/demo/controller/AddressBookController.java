package com.example.demo.controller;

import com.example.demo.DTO.AddressBookDTO;
import com.example.demo.DTO.ResponseDTO;
import com.example.demo.model.AddressBookData;
import jakarta.websocket.server.PathParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController

public class AddressBookController {
    @RequestMapping("/")
    public ResponseEntity<ResponseDTO> getaddressbook(){
        AddressBookData addData=null;
        addData=new AddressBookData(1,new AddressBookDTO("Riya","Shekho Ka Moholla",789987877,"Bhopal"));
        ResponseDTO respDto=new ResponseDTO("Successfull",addData);
        return new ResponseEntity<ResponseDTO>(respDto,HttpStatus.OK);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<ResponseDTO> getaddressbookId(@PathVariable("id")int id){
        AddressBookData addData=null;
        addData=new AddressBookData(1,new AddressBookDTO("Riya","Shekho Ka Moholla",789987877,"Bhopal"));
        ResponseDTO respDto=new ResponseDTO("Successfull with id",addData);
        return new ResponseEntity<ResponseDTO>(respDto,HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> createaddressbook(@RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addData = null;
        addData = new AddressBookData(1, addressBookDTO);
        ResponseDTO respDto = new ResponseDTO("Successfull", addData);
        return new ResponseEntity<ResponseDTO>(respDto, HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<ResponseDTO> updateaddressbook(@RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addData = null;
        addData = new AddressBookData(1, addressBookDTO);
        ResponseDTO respDto = new ResponseDTO("Successfull", addData);
        return new ResponseEntity<ResponseDTO>(respDto, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
        public ResponseEntity<ResponseDTO> deleteaddressbok(@PathVariable("id")int id){
            ResponseDTO respDto=new ResponseDTO("Success",HttpStatus.OK);
            return new ResponseEntity<ResponseDTO>(respDto,HttpStatus.OK);

        }
    }





