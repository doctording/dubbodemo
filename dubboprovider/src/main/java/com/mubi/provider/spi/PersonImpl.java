package com.mubi.provider.spi;


import com.alibaba.dubbo.common.URL;

public class PersonImpl implements Person{

    @Override
    public void say(URL url) {
        System.out.println("PersonImpl say");
    }
}
