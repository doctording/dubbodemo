package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mubi.api.ProductService;
import java.io.IOException;

/**
 * Created by mubi on 2017/12/7.
 */
public class ClientMain {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml" );
        context.start();
        ProductService service = (ProductService) context.getBean("productService");
        System.out.println(service.sayHello("mubi"));
        //context.close();
        System.in.read();
    }
}
