package spring.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
       
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        A aclass = (A) context.getBean("aclass");
        B bclass = (B) context.getBean("bclass");
        C cclass = (C) context.getBean("cclass");
        System.out.println(aclass);
        System.out.println(bclass);
        System.out.println(cclass);
    }
}
