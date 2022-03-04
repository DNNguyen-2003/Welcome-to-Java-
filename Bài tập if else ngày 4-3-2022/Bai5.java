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
public class Bai5 {
    public static void main (String[] args){
   try{ Scanner in = new Scanner(System.in);
        System.out.print("Nhập X: ");
        double x = in.nextDouble();
        System.out.print("Nhập Y: ");
        double y = in.nextDouble();
        x = Math.round(x * 1000);
        x = x / 1000;
        y = Math.round(y * 1000);
        y = y / 1000;
        if (x == y)
        {
            System.out.println("Giống nhau đến ba chữ số thập phân");
        }
        else
        {
            System.out.println("Số khác nhau");
        }
    }catch (Exception e)
    {
        System.out.println("Không hợp lệ !!!");
    }
   }
}