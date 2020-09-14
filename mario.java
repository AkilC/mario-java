package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("How many rows?");
            n = input.nextInt();
        } while (n < 1 || n >8);
        blocks(n);
    }

    static void blocks(int n) {
        for(int row = 0;row<n; row++){
            for(int column = 0;column<n;column++){
                if((row+column) >= (n-1)) {
                    System.out.print("#");
                } else
                    System.out.print(" ");
            }
            System.out.print(" ");
            for(int rightcolumn = 0; rightcolumn <= row; rightcolumn++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
