package com.mubi.provider.spi;

/**
 * @Author mubi
 * @Date 2020/9/1 18:26
 */
public class CarImp3 implements Car{

    public CarImp3(){
        System.out.println("CarImp3()");
    }

    @Override
    public void drive() {
        System.out.println("CarImp3 drive");
    }
}
