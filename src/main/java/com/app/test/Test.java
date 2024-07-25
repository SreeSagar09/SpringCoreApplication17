package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.MaterialComponent;
import com.app.ProductComponent;
import com.app.config.AppConfig;
import com.app1.ItemComponent;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		System.out.println("Number of Beans: "+applicationContext.getBeanDefinitionCount());
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		System.out.println("Beans Names:");
		for (String string : beanDefinitionNames) {
			System.out.println(string);
		}
		
		ProductComponent productComponent = applicationContext.getBean(ProductComponent.class);
		System.out.println("ProductComponent Bean");
		System.out.println(productComponent);
		
		MaterialComponent materialComponent = applicationContext.getBean(MaterialComponent.class);
		System.out.println("MaterialComponent Bean");
		System.out.println(materialComponent);
		
		ItemComponent itemComponent = applicationContext.getBean(ItemComponent.class);
		System.out.println("ItemComponent Bean");
		System.out.println(itemComponent);
		
	}
}
