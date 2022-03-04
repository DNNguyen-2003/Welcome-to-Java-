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
public class Bai1 {
    public static void main(String[] args){
        try{ double n;
        System.out.print("Nhập N: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextDouble();
        if (n>0)
        {
            System.out.println("Số dương");
        }else if (n<0) 
        {
            System.out.println("Số âm");
        }else 
        {
            System.out.println("Số không");
        }
   }catch (Exception e){
       System.out.println("Không hợp lệ !!!");
   }
    }
            
}
