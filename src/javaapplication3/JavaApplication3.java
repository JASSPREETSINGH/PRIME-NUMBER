/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Boolean prime = true;
        System.out.println("enter the number you want to know us prime or not?");
        int num = in.nextInt();
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                prime = false;
            }
        }
        if (prime) {
            System.out.println("the number is prime");
        } else {
            System.out.println("the number is not prime");
        }

    }
}
