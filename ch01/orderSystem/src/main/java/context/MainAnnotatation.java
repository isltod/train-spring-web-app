package context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAnnotatation {
    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
}
