package farbfetzen;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class Application {

    public static void main(final String[] args) {
        new ClassPathXmlApplicationContext("beans.xml");
    }
}
