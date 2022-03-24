/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

import java.util.Scanner;

/**
 *
 * @author Lab
 */
public class Bai1 {
    public static void Mang(int a[],int n){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập phần tử trong mảng: ");
        for (int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.print("Mảng vừa nhập là: ");
        for (int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void TBC(int a[],int n){
        int tbc =0;
        for (int i=0;i<n;i++)
        {  
           tbc+=a[i];
        }
        System.out.println("Trung bình cộng của mảng: "+(tbc/n));
    }
    public static void main(String[] args) {
        int m;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        Mang(a,n);
        TBC(a,n);
    }
}
