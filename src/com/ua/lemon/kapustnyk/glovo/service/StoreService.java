package com.ua.lemon.kapustnyk.glovo.service;

import com.ua.lemon.kapustnyk.glovo.model.ProductInfo;

import java.util.ArrayList;
import java.util.List;

public class StoreService {

    public List<ProductInfo> getProductsInformation(List<String> wishes) {
        List<ProductInfo> result = new ArrayList<>();
        wishes.forEach(s -> result.add(new ProductInfo(s, 9.99, true)));

        return result;
    }
}
