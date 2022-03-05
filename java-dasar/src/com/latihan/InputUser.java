package com.latihan;

import java.util.Scanner;

public class InputUser {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        int panjang, lebar, luas, tinggi, volume;

//        int input = userInput.nextInt();
//        System.out.println("input = " + input);

        System.out.println("Menghitung luas persegi panjang");

        System.out.print("panjang = ");
        panjang = userInput.nextInt();

        System.out.print("lebar = ");
        lebar = userInput.nextInt();

        luas = panjang * lebar;
        System.out.println("Luas = " + luas);

        System.out.println("Menghitung volume");
        System.out.print("tinggi = ");
        tinggi = userInput.nextInt();
        volume = luas * tinggi;
        System.out.println("Volume = "+ volume);
    }
}
