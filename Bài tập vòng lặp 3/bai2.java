/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vonglap3;

import java.util.Scanner;

/**
 *
 * @author Lab
 */
public class bai2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Nhập N: ");
        int n=sc.nextInt();
        int m=1;
        for(int i=1;i<=n;i++)
        {
            m*=(i*2);
        }
        System.out.println("Tổng: "+m);
        int x;
        int y=1;
        do{
          System.out.print("Nhập N: ");
          x=sc.nextInt();  
        }while(x<=0||x%2==0);
        for (int i=1;i<=x;i=i+2)
        {
            y*=i;
        }
        System.out.println("Tổng: "+y);
        
    }
}


