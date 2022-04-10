package javacode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Cau2 {
	public static void main(String[] args) {
		Student st=new Student("Ngoc Nguyen",18,10,"21T1020209","CNTT");
		Student st1=new Student("Hieu",19,10,"21T1237889","QuanSu");
		
		try {
			FileOutputStream fos=new FileOutputStream("E:\\test2.txt");
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			
			oos.writeObject(st);
			oos.writeObject(st1);
			
			oos.close();
			fos.close();
			
			
			FileInputStream fis = new FileInputStream("E:\\test2.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			while(fis.available()>0) {
				try {
					Student obj=(Student) ois.readObject();
					System.out.println(obj);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
