package com.spring.study.nys;

import com.spring.study.nys.domain.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ningyashu
 * @program: spring
 * @Description: 启动loader
 * @date 2021/8/4 5:01 下午
 */
public class ApplicationLoader {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		Person person = applicationContext.getBean(Person.class);
		System.out.println("启动成功==================="+person);
	}
}
