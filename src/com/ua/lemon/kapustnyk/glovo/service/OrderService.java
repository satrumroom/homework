package com.ua.lemon.kapustnyk.glovo.service;

import com.ua.lemon.kapustnyk.glovo.dao.StoreDao;
import com.ua.lemon.kapustnyk.glovo.dao.StoreMetroDao;
import com.ua.lemon.kapustnyk.glovo.dao.StorePosadDao;
import com.ua.lemon.kapustnyk.glovo.model.Order;
import com.ua.lemon.kapustnyk.glovo.model.OrderInfo;
import com.ua.lemon.kapustnyk.glovo.model.ProductInfo;

import java.util.List;

public class OrderService {

//    private StoreService storeService = new StoreService();
    private StoreDao storeDao = new StorePosadDao();

    public OrderInfo makeOrder(Order order) {
        List<String> wishes = order.getWishes();
        List<ProductInfo> productInfoList =
                storeDao.getProductsInformation(wishes);
        String deliveryTime = "19:55";
        double sum = 0;
        for (int i = 0; i < productInfoList.size(); i++) {
            if (productInfoList.get(i).isAvailable()) {
                sum += productInfoList.get(i).getPrice();
            }
        }

        return new OrderInfo(productInfoList, deliveryTime, sum, order);
    }

    public String confirmOrder(OrderInfo orderInfo, boolean isConfirm) {
        if (isConfirm) {
            return "+3806666666666";
        } else {
            return "good bye";
        }
    }
}
