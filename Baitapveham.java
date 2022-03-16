/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

import java.util.Scanner;

/**
 *
 * @author Lab
 */
public class Baitapveham {
    public static void Print1(){
            System.out.println("Lập trình Java 2021");
}
    public static void Print2(String a){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi kí tự: ");
        a = sc.nextLine();
        System.out.print("Chuỗi đã nhập là: ");
        System.out.println(a);
    }
    public static void Print3(int n,String b){
        Scanner sc = new Scanner(System.in);
        do{
        System.out.print("Nhập N: ");
        n = sc.nextInt();
        }while(n<0);
        for (int i=0;i<n;i++)
        {
            Print2(b);
        }
    }
    public static void GiaiPTBac1(float a,float b){
        if(a==0)
        {
            if(b==0)
            {
                System.out.println("Phương trình vô số nghiệmh");
            }else {
                System.out.println("Phương trình vô nghiệm");
            }
        }else 
        {
            System.out.println("Phương trình có nghiệm: "+(-b/a));
        }
        return;
    }
    public static void GiaiPTBac2(float x,float y, float z){
        if(x==0)
        {
            GiaiPTBac1(y,z);
        }else{
        float delta = y*y - 4*x*z;
        float x1;
        float x2;
        if (delta > 0) {
            x1 = (float) ((-y + Math.sqrt(delta)) / (2*x));
            x2 = (float) ((-y - Math.sqrt(delta)) / (2*x));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-y / (2 * x));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
        }
    }
    public static void LuaChon (int m)
    {
        float x,y,z;
        Scanner sc = new Scanner (System.in);
        if (m==1)
        {
            System.out.print("Nhập X: ");
            x= sc.nextFloat();
            System.out.print("Nhập Y: ");
            y= sc.nextFloat();
            GiaiPTBac1(x, y);
        }else if (m==2)
        {
            System.out.print("Nhập X: ");
            x= sc.nextFloat();
            System.out.print("Nhập Y: ");
            y= sc.nextFloat();
            System.out.print("Nhập z: ");
            z= sc.nextFloat();
            GiaiPTBac2(x, y, z);
        }
    }
    public static void main(String[] args) {
        Print1();
        String a = null;
        String b = null;
        int n=0;
        Print2(a);
        Print3(n,b);
        float x,y,z,c,d;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập A: ");
        c = sc.nextInt();
        System.out.print("Nhập B: ");
        d = sc.nextInt();
        GiaiPTBac1(c,d);
        System.out.print("Nhập X: ");
        x = sc.nextFloat();
        System.out.print("Nhập Y: ");
        y = sc.nextFloat();
        System.out.print("Nhập Z: ");
        z = sc.nextFloat();
        GiaiPTBac2(x,y,z);
        System.out.println("Chọn 1: Giải PT Bậc 1");
        System.out.print("Chọn 2: Giải PT Bậc 2");
        int m=sc.nextInt();
        LuaChon(m);
    }
    
}


