/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 84705
 */
public class Slide25Topic3 {
    public static void main (String[] args){
  try{  Scanner sc = new Scanner(System.in);
        float x,y,z;
        System.out.print("Nhập cân nặng của bạn(kg): ");
        x= sc.nextFloat();
        System.out.print("Nhập chiều cao của bạn(m): ");
        y= sc.nextFloat();
        z=x/(y*2);
        if (z<18.5)
        {
            System.out.println("Chỉ số BMI của bạn là "+z+" bạn bị thiếu cân.");
        }else if (z>=18.5&&z<25)
        {
            System.out.println("Chỉ số BMI của bạn là "+z+" bạn ổn định.");
        }else if (z>=25&&z<30)
        {
            System.out.println("Chỉ số BMI của bạn là "+z+" bạn bị thừa cân.");
        }else if (z>=30)
        {
            System.out.println("Chỉ số BMI của bạn là "+z+" bạn bị béo phì.");
        }
  }catch (Exception e)
  {
      System.out.println("Nhập không hợp lệ !!");
  }
}
}