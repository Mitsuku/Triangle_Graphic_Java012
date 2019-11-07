
package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the numbers");
        int In = scanner.nextInt();
        for(int x=In;x>0;x--){
            for(int k=In-x ;k>0;k--){
                System.out.print(" ");
            }
            for (int y=x;y>0;y--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}