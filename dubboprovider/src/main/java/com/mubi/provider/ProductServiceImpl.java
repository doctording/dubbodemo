package com.mubi.provider;

import com.mubi.api.ProductService;

/**
 * Created by mubi on 2017/12/7.
 */
public class ProductServiceImpl implements ProductService {

    @Override
    public String sayHello(String name) {
        System.out.println("service implementation : " + name);
        return "first service:" + name;
    }
}
