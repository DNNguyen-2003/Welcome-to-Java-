package javacode;

import java.io.Serializable;

public class Student extends Person implements Serializable{
	String MaSv;
	String Nganh;
	
	public Student(String name, int age, int dtb, String maSv, String nganh) {
		super(name, age, dtb);
		MaSv = maSv;
		Nganh = nganh;
	}

	public String getMaSv() {
		return MaSv;
	}

	public void setMaSv(String maSv) {
		MaSv = maSv;
	}

	public String getNganh() {
		return Nganh;
	}

	public void setNganh(String nganh) {
		Nganh = nganh;
	}

	@Override
	public String toString() {
		return "Student [MaSv=" + MaSv + ", Nganh=" + Nganh + ", name=" + name + ", age=" + age + ", dtb=" + dtb + "]";
	}
	
}
