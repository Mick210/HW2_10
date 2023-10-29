package com.example.HW210.shoppingCart;

import java.util.Objects;

public class ShoppingCart {
    Integer idProduct;
    String nameProduct;

    public ShoppingCart(Integer idProduct, String nameProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingCart shoppingCart = (ShoppingCart) o;
        return Objects.equals(idProduct, shoppingCart.idProduct) && Objects.equals(nameProduct, shoppingCart.nameProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProduct, nameProduct);
    }
}
