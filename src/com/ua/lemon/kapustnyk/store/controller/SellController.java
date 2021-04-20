package com.ua.lemon.kapustnyk.store.controller;

import com.ua.lemon.kapustnyk.store.dto.OrderDto;
import com.ua.lemon.kapustnyk.store.dto.WishesDto;
import com.ua.lemon.kapustnyk.store.service.SellService;

public class SellController {

    private SellService sellService = new SellService();

    public OrderDto getItems(WishesDto wishesDto) {
        return sellService.getOrder(wishesDto);
    }
}
