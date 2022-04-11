/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KetThucHocPhanJava;

import java.util.Date;

/**
 *
 * @author 84705
 */
public abstract class Person {
	protected String name;
	protected Date birthday;
	protected byte gender;
	
	public Person(String name, Date birthday, byte gender) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public byte getGender() {
		return gender;
	}

	public void setGender(byte gender) {
		this.gender = gender;
	}
	
	
}

