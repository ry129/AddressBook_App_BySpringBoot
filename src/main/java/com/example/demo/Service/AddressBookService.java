package com.example.demo.Service;

import com.example.demo.DTO.AddressBookDTO;
import com.example.demo.Exceptions.AddressBookException;
import com.example.demo.model.AddressBookData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class AddressBookService implements IAddressBookService {

    private List<AddressBookData> addDataList = new ArrayList<>();

    // GET all contacts
    public List<AddressBookData> getAddressBookData() {
        return addDataList;
    }

    // GET contact by ID
    public AddressBookData getAddressBookDataById(int id) {
        return addDataList.stream().filter(addressBookData -> addressBookData.getIdNo()==id).findFirst().orElseThrow(()->new AddressBookException("Address Not Found"));

    }

    // CREATE new contact
    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData addData = new AddressBookData(addDataList.size() + 1, addressBookDTO);
        addDataList.add(addData); // Fix: Add to list
        return addData;
    }

    // UPDATE contact
    public AddressBookData updateAddressBookData(int id, AddressBookDTO addressBookDTO) {
        AddressBookData addData = this.getAddressBookDataById(id);
        addData.setName(addressBookDTO.getName());
        addData.setAddress(addressBookDTO.getAddress());
        addData.setPhnNumber(addressBookDTO.getPhnNumber());
        addData.setCity(addressBookDTO.getCity());
        addDataList.set(id - 1, addData);
        return addData;
    }

    // DELETE contact
    public void deleteAddressBookData(int id) {
        if (id <= 0 || id > addDataList.size()) {
            throw new RuntimeException("Invalid ID: " + id);
        }
        addDataList.remove(id - 1);
    }
}
