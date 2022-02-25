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
public class Phuongtrinhbac2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{ double a,b,c,d;
     Scanner sc = new Scanner(System.in);
     System.out.print("Nhập a: ");
     a = sc.nextDouble();
     System.out.print("Nhập b: ");
     b = sc.nextDouble();
     System.out.print("Nhập c: ");
     c = sc.nextDouble();
     d = b*b-4*a*c;
     if (d>0)
     {
         System.out.println("Phương trình có nghiệm x1 = "+(-b+Math.sqrt(d)/2*a));
         System.out.println("Phương trình có nghiệm x2 = "+(-b-Math.sqrt(d)/2*a));
     }else if(d==0) 
             {
                 System.out.println("Phương trình có nghiệm x= "+ (-b/2*a));
             }else
                {
                     System.out.println("Phương trình vô nghiệm");
                }
     }catch (Exception e){
       System.out.println("Không hợp lệ !!!");
     }
    }
    
}
