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
public class Bai3 {
    public static void main (String[] args){
   try{ double a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập A: ");
        a = sc.nextDouble();
        System.out.print("Nhập B: ");
        b = sc.nextDouble();
        System.out.println(a+" + "+b+" = "+(a+b));
        System.out.println(a+" - "+b+" = "+(a-b));
        System.out.println(a+" * "+b+" = "+(a*b));
        System.out.println(a+" / "+b+" = "+(a/b));
        System.out.println(a+" ^ "+b+" = "+Math.pow(a, b));
        }catch (Exception e)
        {
            System.out.println("Không hợp lệ !!!");
        }
   }
}