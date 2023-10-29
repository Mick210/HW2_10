package com.example.HW210.controller;

import com.example.HW210.service.ShopServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/order")
public class ShopController {
    private ShopServiceImpl serviceBasket;

    public ShopController(ShopServiceImpl serviceBasket) {
        this.serviceBasket = serviceBasket;
    }
    @GetMapping(path = "/add")
    public boolean addProductInBasket(@RequestParam(value = "ID") ArrayList<Integer> productList){
        return serviceBasket.addProductInBasket(productList);
    }
    @GetMapping(path = "/get")
    public List<Integer> getProductInBasket(){
        return serviceBasket.getProductInBasket();
    }
}
