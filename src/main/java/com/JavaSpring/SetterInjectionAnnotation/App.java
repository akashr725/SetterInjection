package com.JavaSpring.SetterInjectionAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Spring.AnnotationBean.Flifkart;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext cntx=new ClassPathXmlApplicationContext("NewFile.xml");
        
            Flifkart fkart =cntx.getBean("fkart",Flifkart.class);
            
            fkart.AmountCalculate();
            System.out.println(fkart);
    }
}
