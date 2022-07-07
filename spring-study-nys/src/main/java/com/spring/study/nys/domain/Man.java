package com.spring.study.nys.domain;

/**
 * @author ningyashu
 * @program: spring
 * @Description: man
 * @date 2022/6/12 10:54 下午
 */
public class Man {

	private String manName;

	public Man() {
		System.out.println("Man-----实例化Instantiation");
	}

	public String getManName() {
		return manName;
	}

	public void setManName(String manName) {
		this.manName = manName;
	}

	@Override
	public String toString() {
		return "Man{" +
				"manName='" + manName + '\'' +
				'}';
	}
}
