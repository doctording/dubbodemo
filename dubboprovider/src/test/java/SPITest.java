import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.mubi.provider.spi.Car;
import org.junit.Assert;
import org.junit.Test;

import java.util.ServiceLoader;
import java.util.concurrent.TimeUnit;

/**
 * @Author mubi
 * @Date 2020/9/1 18:33
 */
public class SPITest {

    @Test
    public void javaSpiTest() {
        ServiceLoader<Car> serviceLoader = ServiceLoader.load(Car.class);
        System.out.println("----java spi");
        boolean b = serviceLoader.iterator().hasNext();
        Assert.assertTrue(b);
        while(true) {
            for (Car car : serviceLoader) {
                car.drive();
            }
            try {
                TimeUnit.SECONDS.sleep(4);
            } catch (Exception e) {

            }
            System.out.println("----java spi end");
        }
    }

    @Test
    public void dubboSpiHello() {
        ExtensionLoader<Car> extensionLoader =
                ExtensionLoader.getExtensionLoader(Car.class);
        System.out.println("----dubbo spi");
        Car car1 = extensionLoader.getExtension("car1");
        car1.drive();
        Car car2 = extensionLoader.getExtension("car2");
        car2.drive();
    }
}
