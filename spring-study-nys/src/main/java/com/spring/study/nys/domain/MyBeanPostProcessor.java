package com.spring.study.nys.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author ningyashu
 * @program: spring
 * @Description: 自定义BeanPostProcessor
 * @date 2022/6/9 3:21 下午
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
	public MyBeanPostProcessor () {
		System.out.println("MyBeanPostProcessor-----实例化Instantiation");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("MyBeanPostProcessor-spring中bean实例初始化之前开始处理: " + beanName + " ......");
		if (bean instanceof Person){
			((Person) bean).setAge(99999);
		}
		System.out.println("MyBeanPostProcessor-spring中bean实例初始化之前完成处理: " + beanName + " ......");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("MyBeanPostProcessor-spring中bean实例初始化之后处理开始: " + beanName + " ......");
		System.out.println("MyBeanPostProcessor-spring中bean实例初始化之后完成处理: " + beanName + " ......");
		return bean;
	}
}
