package main;

import java.io.IOException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by mubi on 2017/12/7.
 */
public class ServerMain {

    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml" );
        context.start();
        System.out.println("服务启动...");
        System.in.read();
        //context.close();
    }
}
