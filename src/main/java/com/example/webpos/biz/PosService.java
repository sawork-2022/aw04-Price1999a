package com.example.webpos.biz;

import com.example.webpos.model.Cart;
import com.example.webpos.model.Product;

import java.util.List;

public interface PosService {

    public void checkout(Cart cart);

    public void cancelCart(Cart cart);

    public Cart add(Cart cart, Product product, int amount);

    public Cart add(Cart cart, String productId, int amount);

    public List<Product> products(int k);

    public double getTaxRate();

    public double getDiscount();

    public double getTotal(Cart cart);

    public Product randomProduct();
}
