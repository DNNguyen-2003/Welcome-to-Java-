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
public class Bai9 {
    public static void main(String[] args) {
   try{ Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int n= sc.nextInt();
        int m;
        while (n!=0)
        {
            m=n%10;
            n=n/10;
            System.out.print(m);
        }
   }catch(Exception e)
   {
       System.out.print("Không hợp lệ !!!");
   }
}
}