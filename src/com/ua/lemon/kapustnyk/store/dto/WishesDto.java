package com.ua.lemon.kapustnyk.store.dto;

import java.util.List;

public class WishesDto {
    private List<String> phonesToBuy;
    private List<String> laptopsToBuy;

    public WishesDto() {
    }

    public WishesDto(List<String> phonesToBuy, List<String> laptopsToBuy) {
        this.phonesToBuy = phonesToBuy;
        this.laptopsToBuy = laptopsToBuy;
    }

    public List<String> getPhonesToBuy() {
        return phonesToBuy;
    }

    public void setPhonesToBuy(List<String> phonesToBuy) {
        this.phonesToBuy = phonesToBuy;
    }

    public List<String> getLaptopsToBuy() {
        return laptopsToBuy;
    }

    public void setLaptopsToBuy(List<String> laptopsToBuy) {
        this.laptopsToBuy = laptopsToBuy;
    }
}
