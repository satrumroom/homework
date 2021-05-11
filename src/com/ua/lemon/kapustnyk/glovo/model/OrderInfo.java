package com.ua.lemon.kapustnyk.glovo.model;

import java.util.List;

public class OrderInfo {

    private List<ProductInfo> productInfos;
    private String deliveryTime;
    private double orderSum;
    private Order order;

    public OrderInfo() {
    }

    public OrderInfo(List<ProductInfo> productInfos, String deliveryTime, double orderSum, Order order) {
        this.productInfos = productInfos;
        this.deliveryTime = deliveryTime;
        this.orderSum = orderSum;
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public List<ProductInfo> getProductInfos() {
        return productInfos;
    }

    public void setProductInfos(List<ProductInfo> productInfos) {
        this.productInfos = productInfos;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public double getOrderSum() {
        return orderSum;
    }

    public void setOrderSum(double orderSum) {
        this.orderSum = orderSum;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
                "productInfos=" + productInfos +
                ", deliveryTime='" + deliveryTime + '\'' +
                ", orderSum=" + orderSum +
                ", order=" + order +
                '}';
    }
}
