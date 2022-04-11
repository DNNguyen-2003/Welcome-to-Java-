/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KetThucHocPhanJava;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author 84705
 */
public class Student extends Person implements Comparable<Student>,Serializable{
	protected String studentID;
	protected String major;
	protected Date enrolledDate;
	
	public Student(String name, Date birthday, byte gender, String studentID, String major, Date enrolledDate) {
		super(name, birthday, gender);
		this.studentID = studentID;
		this.major = major;
		this.enrolledDate = enrolledDate;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public Date getEnrolledDate() {
		return enrolledDate;
	}

	public void setEnrolledDate(Date enrolledDate) {
		this.enrolledDate = enrolledDate;
	}
	
	public String getten() {
		String s = this.name.trim();
		if(s.indexOf(" ")>=0) {
			int vt = s.lastIndexOf(" ");
			return s.substring(vt+1);
		}else {
			return s;
		}
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", major=" + major + ", enrolledDate=" + enrolledDate + ", name="
				+ name + ", birthday=" + birthday + ", gender=" + gender + "]";
	}

	@Override
	public int compareTo(Student o) {
		String nameThis=this.getten();
		String nameO=o.getten();
		
		return nameThis.compareTo(nameO);
	}
	
	
}
