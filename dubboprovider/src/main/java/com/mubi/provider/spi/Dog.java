package com.mubi.provider.spi;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.SPI;

/**
 * @Author mubi
 * @Date 2020/9/1 23:15
 */
@SPI
public interface Dog {

    void test(URL url);
}
