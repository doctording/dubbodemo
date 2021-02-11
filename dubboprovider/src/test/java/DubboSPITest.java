import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.mubi.provider.spi.Car;
import com.mubi.provider.spi.Dog;
import org.junit.Test;

import java.util.ServiceLoader;

/**
 * @Author mubi
 * @Date 2020/9/1 18:33
 */
public class DubboSPITest {

    @Test
    public void dubboSpiHello() {
        ExtensionLoader<Dog> extensionLoader =
                ExtensionLoader.getExtensionLoader(Dog.class);

        URL url = new URL("http", "localhost", 8080);
        url = url.addParameter("person", "person1");

        Dog dog1 = extensionLoader.getExtension("dog1");
        dog1.test(url);
    }
}
