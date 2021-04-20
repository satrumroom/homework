package com.ua.lemon.kapustnyk.store.dao;

import com.ua.lemon.kapustnyk.exceptions.PhoneNotFoundException;
import com.ua.lemon.kapustnyk.store.domain.Phone;

public interface PhoneDao {

    void addPhone(Phone phone);

    Phone getPhoneByName(String model) throws PhoneNotFoundException, Exception;
}
