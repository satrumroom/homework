package com.ua.lemon.kapustnyk.store.service;

import com.ua.lemon.kapustnyk.exceptions.PhoneNotFoundException;
import com.ua.lemon.kapustnyk.store.dao.LaptopDao;
import com.ua.lemon.kapustnyk.store.dao.LaptopLocalDao;
import com.ua.lemon.kapustnyk.store.dao.PhoneDao;
import com.ua.lemon.kapustnyk.store.dao.PhoneLocalDao;
import com.ua.lemon.kapustnyk.store.domain.Phone;
import com.ua.lemon.kapustnyk.store.dto.OrderDto;
import com.ua.lemon.kapustnyk.store.dto.WishesDto;

import java.util.ArrayList;
import java.util.List;

public class SellService {

    private LaptopDao laptopDao = new LaptopLocalDao();
    private PhoneDao phoneDao = new PhoneLocalDao();

    public OrderDto getOrder(WishesDto wishesDto) {
        OrderDto orderDto = new OrderDto();

        if (!wishesDto.getPhonesToBuy().isEmpty()) {
            List<Phone> phonesOrder = new ArrayList<>();
            wishesDto.getPhonesToBuy().forEach(phoneToBuy -> {
                Phone phone = null;
                try {
                    phone = phoneDao.getPhoneByName(phoneToBuy);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                phonesOrder.add(phone);
            });
            orderDto.setPhones(phonesOrder);

        }






        return orderDto;
    }
}
