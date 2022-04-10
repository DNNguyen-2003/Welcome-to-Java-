package javacode;

import java.io.Serializable;

public class Person implements Serializable{
	String name;
	int age;
	int dtb;
	
	public Person(String name, int age, int dtb) {
		super();
		this.name = name;
		this.age = age;
		this.dtb = dtb;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getDtb() {
		return dtb;
	}

	public void setDtb(int dtb) {
		this.dtb = dtb;
	}
	
}
