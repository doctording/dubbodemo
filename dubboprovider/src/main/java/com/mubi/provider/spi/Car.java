package com.mubi.provider.spi;

import com.alibaba.dubbo.common.extension.SPI;

/**
 * @Author mubi
 * @Date 2020/9/1 18:26
 */
@SPI
public interface Car {
    void drive();
}
