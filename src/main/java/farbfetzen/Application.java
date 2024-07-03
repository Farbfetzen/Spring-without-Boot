package farbfetzen;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ImportResource;

@ImportResource("beans.xml")
@Slf4j
public class Application {

    public static void main(final String[] args) {
        new AnnotationConfigApplicationContext(Application.class);
    }
}
