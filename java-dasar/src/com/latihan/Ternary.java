package com.latihan;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        int input, x;

        System.out.print("Masukan nilai = ");
        input = userInput.nextInt();
        System.out.println(input);

        x = (input == 10) ? (input * input) : (input / 2);
        System.out.println("hasil = "+ x);
    }
}
