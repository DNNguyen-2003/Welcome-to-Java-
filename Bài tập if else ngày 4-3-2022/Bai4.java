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
public class Bai4 {
    public static void main (String[] args){
   try{ int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập N: ");
            n = sc.nextInt();
        }while(n>7||n<1);
        switch(n)
        {
            case 1:
                System.out.println("Thứ hai");
                break;
            case 2:
                System.out.println("Thứ ba");
                break;
            case 3:
                System.out.println("Thứ tư");
                break;
            case 4:
                System.out.println("Thứ năm");
                break;
            case 5:
                System.out.println("Thứ sáu");
                break;
            case 6:
                System.out.println("Thứ bảy");
                break;
            case 7: 
                System.out.println("Chủ nhật");
                break;
        } 
   }catch (Exception e)
   {
       System.out.println("Không hợp lệ !!!");
   }

    }
}