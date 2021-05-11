package com.ua.lemon.kapustnyk.glovo;

import com.ua.lemon.kapustnyk.glovo.model.Order;
import com.ua.lemon.kapustnyk.glovo.model.OrderInfo;
import com.ua.lemon.kapustnyk.glovo.model.ProductInfo;
import com.ua.lemon.kapustnyk.glovo.service.OrderService;
import com.ua.lemon.kapustnyk.glovo.service.StoreService;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Order order1 = new Order(
                List.of("kolbasa", "moloko"),
                "sumskaya 22",
                "posad");
       // System.out.println(order1);
        Order order2 = new Order();
        order2.setPlace("metro nauki");
        System.out.println(order2.getPlace());

        OrderService orderService = new OrderService();
        OrderInfo orderInfo = orderService.makeOrder(order1);
       // System.out.println(orderInfo);
        if (orderInfo.getOrderSum() < 1000) {
            orderService.confirmOrder(orderInfo, true);
        } else {
            orderService.confirmOrder(orderInfo, false);
        }
    }
}
