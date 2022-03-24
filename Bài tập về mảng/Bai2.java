/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Lab
 */
public class Bai2 {
    public static void Mang(int a[],int n){
        Random rd = new Random();
        for (int i=0;i<n;i++)
        {
            a[i]=rd.nextInt(1000);
        }
        System.out.print("Xuất mảng: ");
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
        System.out.print("Trung bình cộng của mảng: "+(tbc/n));
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
