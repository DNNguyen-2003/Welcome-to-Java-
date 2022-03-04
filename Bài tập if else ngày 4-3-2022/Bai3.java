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
   Scanner in = new Scanner(System.in);
        System.out.print("Nhập số bất kì: ");
        double input = in.nextDouble();

        if (input > 0)
        {
            if (input < 1)
            {
                System.out.println("Số dương rất bé");
            }
            else if (input > 1000000)
            {
                System.out.println("Số dương rất lớn");
            }
            else
            {
                System.out.println("Số dương");
            }
        }
        else if (input < 0)
        {
            if (Math.abs(input) < 1)
            {
                System.out.println("Số âm rất bé");
            }
            else if (Math.abs(input) > 1000000)
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
    }
}