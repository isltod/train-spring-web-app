package context;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class MainXML {
    public static void main(String[] args) {
//    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        GenericApplicationContext context = new GenericApplicationContext();
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(context);
        xmlBeanDefinitionReader.loadBeanDefinitions("beans.xml");
        context.refresh();
    }
}
