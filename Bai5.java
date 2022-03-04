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
public class Bai5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        double x = sc.nextDouble();
        System.out.print("Nhập số thứ hai: ");
        double y = sc.nextDouble();

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
    }
    }
