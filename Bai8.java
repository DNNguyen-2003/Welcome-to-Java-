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
public class Bai8 {
    public static void main(String[] args) {
        try{ int n;
        int m=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        n = sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            m*=i;
        }
        System.out.println("Giai thưa của "+n+" là: "+m);
    }
      catch (Exception e)
    {
        System.out.print("Không hợp lệ !!!");
    }
}
}
