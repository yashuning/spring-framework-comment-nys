package com.spring.study.nys.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author ningyashu
 * @program: spring
 * @Description: 自定义BeanFactoryPostProcessor
 * @date 2022/6/13 8:16 下午
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	public MyBeanFactoryPostProcessor() {
		System.out.println("MyBeanFactoryPostProcessor-----实例化Instantiation");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("MyBeanFactoryPostProcessor-spring中beanFactory实例化之后开始处理......");
	}
}
