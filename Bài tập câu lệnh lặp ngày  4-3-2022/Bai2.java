/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacode;

import java.util.Scanner;

/**
 *
 * @author Lab
 */
public class Bai2 {
    public static void main (String[] args){
    int n = 5;
    for (int i=n;i>=1;i--){
        for (int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
}
}
