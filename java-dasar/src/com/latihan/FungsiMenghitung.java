package com.latihan;

import java.util.Scanner;

public class FungsiMenghitung {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("panjang = ");
        int inputPanjang = input.nextInt();

        System.out.print("lebar = ");
        int inputLebar = input.nextInt();

        gambar(inputPanjang, inputLebar);

        tampilLuasDanKeliling(inputPanjang, inputLebar);
    }

    public static void gambar(int panjang, int lebar){
        for (int i = 0; i < lebar; i++){
            for (int j = 0; j < panjang; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    private static int luas(int panjang, int lebar){
        int hasil = panjang * lebar;
        return hasil;
    }

    private static int keliling(int panjang, int lebar){
        int hasil = (panjang + lebar) * 2;
        return hasil;
    }

    private static void tampilLuasDanKeliling(int panjang, int lebar){
        System.out.println("luas = "+ luas(panjang, lebar));
        System.out.println("keliling = "+ keliling(panjang, lebar));
    }
}
