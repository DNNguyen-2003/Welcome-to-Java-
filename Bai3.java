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
   try{ Scanner in = new Scanner(System.in);
        System.out.print("Nhập N: ");
        double n = in.nextDouble();

        if (n > 0)
        {
            if (n < 1)
            {
                System.out.println("Số dương rất nhỏ");
            }
            else if (n > 1000000)
            {
                System.out.println("Số dương rất lớn");
            }
            else
            {
                System.out.println("Số dương");
            }
        }
        else if (n < 0)
        {
            if (Math.abs(n) < 1)
            {
                System.out.println("Số âm rất nhỏ");
            }
            else if (Math.abs(n) > 1000000)
            {
                System.out.println("Số âm rất lớn");
            }
            else
            {
                System.out.println("Số âm");
            }
        }
        else
        {
            System.out.println("Số không");
        }
    }catch (Exception e){
            System.out.println("Không hợp lệ !!!");
    }
}
}
