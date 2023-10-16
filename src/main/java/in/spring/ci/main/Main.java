package in.spring.ci.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import in.spring.ci.Car;

public class Main
{
	public static void main(String[] args)
	{
		//start IOC
//		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("Beans.xml"));
//		Car car=factory.getBean(Car.class);
//		System.out.println("Application Execution Completed.........");
		System.out.println("ApplicationContext Execution started....");
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		Car bean=context.getBean(Car.class);
		bean.drive();
	}
}
