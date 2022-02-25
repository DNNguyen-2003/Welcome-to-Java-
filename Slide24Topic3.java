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
public class Slide24Topic3 {
    public static void main (String[] args){
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int x,y,z,n;
        y= random.nextInt(100)+1;
        x= random.nextInt(50)+y;
        z=x-y;
        System.out.print(x+" - "+y+" = ");
        n= sc.nextInt();
        if(n==z)
        {
            System.out.println("Đáp án chính xác");
        }else {
                   System.out.println("Đáp án chưa chính xác"); 
              }
}
}