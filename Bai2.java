/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacode;

import java.util.Scanner;

/**
 *
 * @author Lab
 */
public class Bai2 {
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
