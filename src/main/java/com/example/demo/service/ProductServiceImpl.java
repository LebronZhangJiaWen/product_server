package com.example.demo.service;

import com.example.demo.domain.Product;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by zhangjiawen on 2019/5/17.
 */
@Service
public class ProductServiceImpl implements ProductService {
    private static final Map<Integer,Product> map=new HashMap<Integer,Product>();

    static {
        Product p1=new Product(1,"荣耀8X",20000,200);
        Product p2=new Product(2,"iPhoneX",254,233);
        Product p3=new Product(3,"三星S10",3546,444);
        Product p4=new Product(4,"iPhone8",4567,555);
        Product p5=new Product(5,"电脑",6745,666);
        map.put(p1.getId(),p1);
        map.put(p2.getId(),p2);
        map.put(p3.getId(),p3);
        map.put(p4.getId(),p4);
        map.put(p5.getId(),p5);
    }

    @Override
    public List<Product> getProductList() {
        Collection<Product> collection= map.values();
        return  new ArrayList<>(collection);
    }

    @Override
    public Product getProductById(int id) {
        return map.get(id);
    }
}
