package com.spring.study.nys.domain;

/**
 * @author ningyashu
 * @program: spring
 * @Description: person信息
 * @date 2022/6/9 10:50 上午
 */
public class Person {

	private String name;

	private Integer age;

	public Person() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
