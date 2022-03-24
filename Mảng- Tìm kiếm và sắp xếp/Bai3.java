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
public class Bai3 {
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
    public static void Mang (int a[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n=sc.nextInt();
        System.out.print("Nhap phan tu trong mang: ");
        for (int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.print("Xuất mảng: ");
        for (int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void TangDan (int a[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n=sc.nextInt();
        System.out.print("Nhap phan tu trong mang: ");
        for (int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for (int i=0;i<n-1;i++)
        {
            for (int j=i;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    int m=a[i];
                    a[i]=a[j];
                    a[j]=m;
                }
            }
        }
        System.out.print("Mảng sắp xếp tăng dần: ");
        for (int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void GiamDan (int a[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n=sc.nextInt();
        System.out.print("Nhap phan tu trong mang: ");
        for (int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for (int i=0;i<n-1;i++)
        {
            for (int j=i;j<n;j++)
            {
                if(a[i]<a[j])
                {
                    int m=a[i];
                    a[i]=a[j];
                    a[j]=m;
                }
            }
        }
        System.out.print("Mảng sắp xếp giảm dần: ");
        for (int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] a=new int[100];
        MangNgauNhien(a);
        Mang(a);
        TangDan(a);
        GiamDan(a);
    }
}
