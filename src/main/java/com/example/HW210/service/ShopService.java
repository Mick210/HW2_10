package com.example.HW210.service;

import java.util.List;

public interface ShopService {
    boolean addProductInBasket(List<Integer> product);
    List<Integer> getProductInBasket();
}
