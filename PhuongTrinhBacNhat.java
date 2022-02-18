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
public class PhuongTrinhBacNhat {
    public static void main (String[] args){
        double a, b;
        double nghiem;
        try{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số a: ");
        a = scanner.nextDouble();
        System.out.print("Nhập vào số b: ");
        b = scanner.nextDouble();
        System.out.print("Phương trình nhập vào là: " + a + "x + " + b + " = 0.");
        if (a == 0) {
            if (b == 0) {
                System.out.print(" Phương trình n có vô số nghiệm.");
            } else {
                System.out.print("Phương trình vô nghiệm.");
            }
        } else {
            nghiem = -b / a;  
            System.out.print("Phương trình có nghiệm x = " + (nghiem) + ".");
        }} catch (NullPointerException e) {
            System.out.print("Không hợp lệ!!!");
                  }
                
              }
    }
