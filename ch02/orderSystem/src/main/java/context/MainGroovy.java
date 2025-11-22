package context;

import org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;

public class MainGroovy {
    public static void main(String[] args) {
//        ApplicationContext context = new GenericGroovyApplicationContext("beans.groovy");
        GenericApplicationContext context = new GenericApplicationContext();
        GroovyBeanDefinitionReader groovyBeanDefinitionReader = new GroovyBeanDefinitionReader(context);
        groovyBeanDefinitionReader.loadBeanDefinitions("beans.groovy");
        context.refresh();
    }
}
