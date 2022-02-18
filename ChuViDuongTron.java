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
public class ChuViDuongTron {
    public static void main (String[] args){
        double r;
        try{
        System.out.print("Nhập bán kính: ");
        Scanner input = new Scanner(System.in);
        r = input.nextDouble();
        System.out.println("Chu vi đường tròn có bán kính "+r+" là: "+(2*r*3.14159));
        }catch (Exception e) {
            System.out.print("Bán kính không hợp lệ!!!");
        }
    }
}