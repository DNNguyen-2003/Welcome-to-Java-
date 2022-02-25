/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phuongtrinhbac2;

import java.util.Scanner;

/**
 *
 * @author Lab
 */
public class Bai10 {
    public static void main(String[] args){
        int x;
        int y = 2021;
        String username;
        String chuoi ="HuyHoang";
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập username: ");
        username = sc.nextLine();
        System.out.print("Nhập password: " );
        x= sc.nextInt();
        if((username.contains(chuoi))==true&&x==y)
        {
            System.out.print("Nhập đúng username và password");
        }else{
                System.out.println("Nhập sai username và password");
                }
    }
    
}
