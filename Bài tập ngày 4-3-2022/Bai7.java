/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacode;

/**
 *
 * @author Lab
 */
public class Bai7 {
    public static void main (String[] args){
    int n = 10, a = 0, b = 1;
    System.out.println("Fibonacci Series till " + n + " terms:");
    for (int i = 1; i <= n; ++i) {
      System.out.print(a + ", ");
      int c = a + b;
      a = b;
      b = c;
    }
}
}