package com.example.demo.service;

import com.example.demo.domain.Product;

import java.util.List;

/**
 * Created by zhangjiawen on 2019/5/17.
 */
public interface ProductService {

    public List<Product> getProductList();
    public Product getProductById(int id);
}
