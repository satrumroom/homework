package com.ua.lemon.kapustnyk.glovo.dao;

import com.ua.lemon.kapustnyk.glovo.model.ProductInfo;

import java.util.List;

public interface StoreDao {

    List<ProductInfo> getProductsInformation(List<String> wishes);
}
