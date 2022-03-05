package com.latihan;

import java.util.Scanner;

public class DeretFibonaci {
    public static void main(String[] args){
        int f_n, f_n_1, f_n_2, n;

        Scanner input = new Scanner(System.in);
        System.out.print("Mengambil deret fibonaci ke - :");
        n = input.nextInt();

        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;

        for (int i = 0; i <= n; i++){
            System.out.println("nilai ke - "+ i + " adalah " + f_n);
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;
        }
    }
}
