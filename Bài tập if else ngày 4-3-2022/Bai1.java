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
public class Bai1 {
    public static void main (String[] args){
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