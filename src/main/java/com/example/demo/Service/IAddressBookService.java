package com.example.demo.Service;
import com.example.demo.DTO.AddressBookDTO;
import com.example.demo.model.AddressBookData;

import java.util.List;

public interface IAddressBookService {
    List<AddressBookData> getAddressBookData();

    AddressBookData getAddressBookDataById(int id);

    AddressBookData createAddressBookData(AddressBookDTO addressBookDTO);

    AddressBookData updateAddressBookData(AddressBookDTO addressBookDTO);

    void deleteAddressBookData(int id);

}
