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
        double a,b;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập a: ");
        a = input.nextDouble();
        System.out.print("Nhập b: ");
        b = input.nextDouble();
        System.out.println("Tổng a+b là: "+(a+b));
        System.out.println("Hiệu a-b là: "+(a-b));
        System.out.println("Tích a*b là: "+(a*b));
        System.out.println("Thương a/b là: "+(a/b));
        System.out.println("Số mũ a^b là: "+(Math.pow(a,b)));
}
}
