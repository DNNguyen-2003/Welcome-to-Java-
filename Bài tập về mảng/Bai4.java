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
public class Bai4 {
    public static void Mang(int a[],int n){
        Random rd = new Random();
        for (int i=0;i<n;i++)
        {
            a[i]=rd.nextInt(1000);
        }
    }
    public static void InTraiSangPhai(int a[],int n){
        System.out.print("Xuất mảng từ trái sang phải: ");
        for (int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void InPhaiSangTrai(int a[],int n){
        System.out.println();
        System.out.print("Xuất mảng từ phải sang trái: ");
        for (int i=n-1;i!=-1;i--)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n=sc.nextInt();
        int[] a =new int[n];
        Mang(a,n);
        InTraiSangPhai(a, n);
        InPhaiSangTrai(a, n);
    }
}
