package com.mubi.provider.spi;

import com.alibaba.dubbo.common.URL;

/**
 * @Author mubi
 * @Date 2020/9/2 08:54
 */
public class DogWrapper implements Dog {
    private Dog dog;
    // 这里的构造器是必须的，否则无法加入该切面
    public DogWrapper(Dog dog) {
        this.dog = dog;
    }

    @Override
    public void test(URL url) {
        System.out.println("aop before");
        dog.test(url);
        System.out.println("aop after");
    }
}
