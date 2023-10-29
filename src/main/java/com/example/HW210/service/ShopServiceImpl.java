package com.example.HW210.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;
import java.util.ArrayList;

@Service
@SessionScope
public class ShopServiceImpl implements ShopService {
    private final List<Integer> basketList = new ArrayList();

    @Override
    public boolean addProductInBasket(List<Integer> product) {
        return basketList.addAll(product);
    }

    @Override
    public List<Integer> getProductInBasket() {
        return basketList;
    }
}
