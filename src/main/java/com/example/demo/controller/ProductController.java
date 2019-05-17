package com.example.demo.controller;

import com.example.demo.domain.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zhangjiawen on 2019/5/17.
 */
@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping("getList")
    public List<Product> getList(){
        return productService.getProductList();
    }

    @RequestMapping("getById")
    public Product getById(int id){
        return productService.getProductById(id);
    }
}
