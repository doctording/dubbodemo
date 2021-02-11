package com.mubi.provider.spi;

/**
 * @Author mubi
 * @Date 2020/9/1 18:26
 */
public class CarImp2 implements Car{

    public CarImp2(){
        System.out.println("CarImp2()");
    }

    @Override
    public void drive() {
        System.out.println("CarImp2 drive");
    }
}
