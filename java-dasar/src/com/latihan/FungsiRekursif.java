package com.latihan;

import java.util.Scanner;

public class FungsiRekursif {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("masukan nilai: ");

        int nilai = input.nextInt();

        printNilai(nilai);
        int jumlah = jumlahNilai(nilai);
        System.out.println("jumlah = "+ jumlah);
    }

    private static int jumlahNilai(int parameter){
        System.out.println("parameter = "+ parameter);
        if(parameter == 0){
            return parameter;
        }
        return parameter + jumlahNilai(parameter -1);
    }

    // fungsi rekursif sederhana
    private static void printNilai(int parameter){
        System.out.println("nilai = " + parameter);

        if(parameter == 0){
            return;
        }

        parameter--;

        printNilai(parameter);
    }
}
