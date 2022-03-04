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
public class Bai4 {
    public static void main(String[] args){
        try{ int n,m;
        int sum=0;
        Scanner sc = new Scanner(System.in);
            System.out.print("Nhập N: ");
        n = sc.nextInt();
        while (n!=0)
        {
            m=n%10;
            sum+=m;
            n=n/10;
        }
            System.out.println("Tổng các chữ số là: "+sum);
   }catch (Exception e)
   {
       System.out.println("Không hợp lệ !!!");
   }

    }
}
