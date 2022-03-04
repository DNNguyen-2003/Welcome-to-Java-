/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap;

import java.util.Scanner;

/**
 *
 * @author 84705
 */
public class Bai2{
    public static void main (String[] args){
   try{ double a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập A: ");
        a = sc.nextDouble();
        System.out.print("Nhập B: ");
        b = sc.nextDouble();
        System.out.print("Nhập C:");
        c = sc.nextDouble();
        if (a>b&&a>c)
        {
            System.out.print("Số lớn nhất là: "+a);
        }else if (b>a&&b>c)
        {
            System.out.print("Số lớn nhất là: "+b);
        }else 
        {
            System.out.print("Số lớn nhất là: "+c);
        }
   }catch (Exception e)
   {
      System.out.println("Không hợp lệ !!!");
   }
}
}
