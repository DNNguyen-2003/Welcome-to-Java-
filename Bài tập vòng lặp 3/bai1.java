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
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int Tong=0;
        System.out.print("Nhập N: ");
        int n=sc.nextInt();
        for (int i=0;i<=n;i++)
        {
            sum+=(i*2);
        }
        System.out.println("Tổng: "+sum);
        int m;
        do{
          System.out.print("Nhập N: ");
          m=sc.nextInt();  
        }while(m<=0||m%2==0);
        for (int i=1;i<=m;i=i+2)
        {
            Tong+=i;
        }
        System.out.println("Tong: "+Tong);
        System.out.print("Nhập X: ");
        int x=sc.nextInt();
        double y=0;
        for(int i=1;i<=x;i++)
        {
            double h=i;
            y+=(1/h);
        }
        System.out.println("Tổng: "+y);
    }
}
