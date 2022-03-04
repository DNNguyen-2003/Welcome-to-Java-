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
public class Bai6 {
    public static void main (String[] args){
        try{ int a,b,n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập A: ");
        a = sc.nextInt();
        System.out.print("Nhập B: ");
        b = sc.nextInt();
        for (int i=a;i<=b;i++)
        {
            System.out.print(i+" ");
        }
    }catch (Exception e)
    {
        System.out.println("Không hợp lê !!!");
    }
}
}