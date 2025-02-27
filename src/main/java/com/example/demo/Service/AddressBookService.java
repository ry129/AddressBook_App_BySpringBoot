package com.example.demo.Service;

import com.example.demo.DTO.AddressBookDTO;
import com.example.demo.model.AddressBookData;

import java.util.ArrayList;
import java.util.List;

public class AddressBookService implements IAddressBookService{
    public List<AddressBookData> getAddressBookData(){
        List<AddressBookData> addData=new ArrayList<>();
        addData.add(new AddressBookData(1,new AddressBookDTO("Riya","Shekho Ka Moholla",789898777,"bHOPAL")));
        return addData;

    }
    public AddressBookData getAddressBookDataById(int id){
        AddressBookData addData=null;
        addData = new AddressBookData(1,new AddressBookDTO("Riya","Shekho ka Moholla",789998789,"Bhopal"));
        return addData;
    }
    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO){
        AddressBookData addData=null;
        addData=new AddressBookData(1,new AddressBookDTO("Riya","Shekho ka Moholla",78999878,"Bhopal"));
        return addData;
    }
    public AddressBookData updateAddressBookData(AddressBookDTO addressBookDTO){
        AddressBookData addData=null;
        addData=new AddressBookData(1,new AddressBookDTO("Riya","Shekho ka Moholla",78999878,"Bhopal"));
        return addData;
    }
    public void deleteAddressBookData(int id){}

}
