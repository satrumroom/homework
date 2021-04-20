package com.ua.lemon.kapustnyk.store.dao;

import com.ua.lemon.kapustnyk.exceptions.PhoneNotFoundException;
import com.ua.lemon.kapustnyk.store.domain.Phone;

public class PhoneLocalDao implements PhoneDao {

  //  SqlDatabase database = new SqlDatabase();
    @Override
    public void addPhone(Phone phone) {
        System.out.println("added");
    }

    @Override
    public Phone getPhoneByName(String model) throws PhoneNotFoundException {
        if (model.equalsIgnoreCase(model)) {
            throw new PhoneNotFoundException("Phone not found " + model);
        }
        return new Phone();


    }
}
