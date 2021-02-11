package com.mubi.provider.spi;

/**
 * @Author mubi
 * @Date 2020/9/1 18:26
 */
public class CarImp1 implements Car{

    public CarImp1(){
        System.out.println("CarImp1()");
    }

    @Override
    public void drive() {
        System.out.println("CarImp1 drive");
    }
}
