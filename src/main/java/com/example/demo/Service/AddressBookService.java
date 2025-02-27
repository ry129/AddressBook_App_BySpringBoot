package com.example.demo.Service;

import com.example.demo.DTO.AddressBookDTO;
import com.example.demo.model.AddressBookData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class AddressBookService implements IAddressBookService{
     private List<AddressBookData> addDataList=new ArrayList<>();

    public List<AddressBookData> getAddressBookData(){
        return addDataList;

    }
    public AddressBookData getAddressBookDataById(int id){
        return addDataList.get(id-1);
    }
    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO){
        AddressBookData addData=null;
        addData=new AddressBookData(addDataList.size()+1,addressBookDTO);
        return addData;

    }
    public AddressBookData updateAddressBookData(int id,AddressBookDTO addressBookDTO){
        AddressBookData addData=this.getAddressBookDataById(id);
        addData.setName(addressBookDTO.name);
        addData.setAddress(addressBookDTO.address);
        addData.setPhnNumber(addressBookDTO.phnNumber);
        addData.setCity(addressBookDTO.city);
        addDataList.set(id-1,addData);
        return addData;
    }
    public void deleteAddressBookData(int id){
        addDataList.remove(id-1);
    }

}
