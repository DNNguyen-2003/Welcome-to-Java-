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
public class Bai3 {
    public static void main(String[] args){
   try{ Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int n = sc.nextInt();
        int sum=0;
        for (int i=0;i<=n;i++)
        {
            sum+=i;
        }
        System.out.println("Tổng = "+sum);
    }catch (Exception e){
            System.out.println("Không hợp lệ !!!");
    }
}
}
