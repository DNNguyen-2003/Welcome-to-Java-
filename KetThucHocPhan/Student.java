/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSwing;


import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author 84705
 */
public class Student extends Person implements Comparable<Student>,Serializable{
    private String StudentID;
    private String major;
    private Date enrolledDate;
    

    public Student() {
    }

    public Student(String StudentID, String major, Date enrolledDate, String name, Date birthday, byte gender) {
        super(name, birthday, gender);
        this.StudentID = StudentID;
        this.major = major;
        this.enrolledDate = enrolledDate;
    }

    Student(String Name, String Birthday, String Gender, String StudentID, String Major, String EnrolledDate) {
    }    
    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
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

    @Override
    public String toString() {
        return "Student{" + "StudentID=" + StudentID + ", major=" + major + ", enrolledDate=" + enrolledDate + '}';
    }

    @Override
    public int compareTo(Student o) {
            String nameThis=this.getten();
		String nameO=o.getten();
		return nameThis.compareTo(nameO);
    }
    
}
