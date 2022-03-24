/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeJava;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 84705
 */
public class Bai2 {
    public static void MangNgauNhien (int a[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n=sc.nextInt();
        Random rd = new Random();
        for (int i=0;i<n;i++)
        {
            a[i]=rd.nextInt(100);
        }
        System.out.print("Xuất mảng: ");
        for (int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void TimKiem (int a[])
    {
        int x,y=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu trong mang: ");
        int n=sc.nextInt();
        System.out.print("Nhap phan tu trong mang: ");
        for (int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.print("Nhap so can tim: ");
        x=sc.nextInt();
        for (int i=0;i<n;i++)
        {
            if(a[i]==x)
            {
                System.out.println("Vi tri cua "+x+" la: "+i);
                y++;
            }
        }
        if(y==0)
        {
            System.out.print("Mảng rỗng");
        }
    }
    public static void main(String[] args) {
        int[] a=new int[100];
        MangNgauNhien(a);
        TimKiem(a);
    }
}
