package com.mubi.provider.spi;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.SPI;

/**
 * @Author mubi
 * @Date 2020/9/1 23:15
 */
@SPI
public class DogImpl implements Dog{

    Person person;

    public void setPerson(Person person) {
        this.person = person;
        System.out.println("set person:" + person.getClass());
    }

    @Override
    public void test(URL url){
        person.say(url);
        System.out.println("DogImpl test");
    }
}
