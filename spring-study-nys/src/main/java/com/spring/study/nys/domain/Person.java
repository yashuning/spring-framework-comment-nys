package com.spring.study.nys.domain;

import javax.annotation.Resource;

/**
 * @author ningyashu
 * @program: spring
 * @Description: person信息
 * @date 2022/6/9 10:50 上午
 */
public class Person {

	private String name;

	private Integer age;

	@Resource
	private Man man;

	public Person() {
		System.out.println("Person-----实例化Instantiation");
	}

	public void init(){
		System.out.println("Person------初始化init");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Person-----属性赋值！！！name="+name);
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		System.out.println("Person-----属性赋值！！！age="+age);
		this.age = age;
	}

	public void setMan(Man man) {
		System.out.println("Person-----属性赋值！！！man="+man);
		this.man = man;
	}

	public Man getMan() {
		return man;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				", man=" + man +
				'}';
	}
}
