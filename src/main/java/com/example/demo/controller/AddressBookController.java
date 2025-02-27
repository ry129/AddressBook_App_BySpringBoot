package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {
    @GetMapping("/get")
    public ResponseEntity<String>getRequestData(){
        return new ResponseEntity<String>("Get Successfull Request", HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<String>getRequestId(@PathVariable int id){
        return new ResponseEntity<String>(("Get Call Request By id" + id),HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<Map<String,String>>postRequestData(@RequestBody Map<String,String> request){
        return new ResponseEntity<Map<String,String>>(request,HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<Map<String,String>>updateRequestData(@RequestBody Map<String,String> request){
        return new ResponseEntity<Map<String,String>>(request,HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String>deleteresponse(@PathVariable int id){
        return new ResponseEntity<String>("Delete call successfull with Id" + id,HttpStatus.OK);
    }



}
