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
public class Bai3 {
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
    }
    public static void MangSoThuc(double b[],int n){
        Random rd = new Random();
        for (int i=0;i<n;i++)
        {
            b[i]=rd.nextDouble();
        }
        System.out.println("");
        System.out.print("Xuất mảng: ");
        for (int i=0;i<n;i++)
        {
            System.out.print(b[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n=sc.nextInt();
        int[] a =new int[n];
        Mang(a,n);
        double [] b =new double[n];
        MangSoThuc(b,n);
    }
}
