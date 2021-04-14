package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,n;
        System.out.println("Enter the Limit:");
        n = sc.nextInt();
        int a = 0, b = 1;
        int c;
        System.out.println(a);                // 1st term
        System.out.println(b);                // 2nd term

        for(i = 3; i <= n; i++) {             // The loop will start from the 3rd term

            c = a + b;
            System.out.println(c);            // 3rd term
            a = b;
            b = c;
        }
    }
}
