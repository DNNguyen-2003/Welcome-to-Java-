package javacode;

import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Cau1 {
	 public static void Mang(int a[],int n){
	        Random rd = new Random();
	        for (int i=0;i<n;i++)
	        {
	            a[i]=rd.nextInt(100);
	        }
	        System.out.print("Xuất mảng: ");
	        for (int i=0;i<n;i++)
	        {
	            System.out.print(a[i]+" ");
	        }
	        System.out.println();
	    }
	 public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);
		 	System.out.print("Nhập số phần tử của mảng: ");
	        int n=sc.nextInt();
	        sc.nextLine();
	        int[] a=new int[n];
	        Mang(a,n);
	        System.out.print("Nhập chuổi ký tự: ");
	        String chuoikitu=sc.nextLine();
	        System.out.print("Chuổi vừa nhập: "+chuoikitu);
	        try {
	        PrintWriter pw =new PrintWriter("E:\\test2.txt","UTF-8");
	        int i=0;
	        while(i<n) {
	        	pw.print(a[i]);
	        	pw.print(" ");
	        	i++;
	        }
	        pw.println();
	        pw.println(chuoikitu);
	        pw.flush();
	        pw.close();
	        }catch (Exception e) {
	        	e.printStackTrace();
	        }
	        File f= new File("E:\\test2.txt");
	        try {
	        	System.out.println();
	        	System.out.println("In nội dung: ");
				List<String> allText= Files.readAllLines(f.toPath());
				for(String line : allText) {
					System.out.println(line);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
	 }
}
