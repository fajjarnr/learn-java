package com.latihan;

public class Overload {
    public static void main(String[] args){
        printAngka(10);
        printAngka(10.5f);
    }

    private static void printAngka(float angka){
        System.out.println("ini nilai float: "+ angka);
    }

    private static void printAngka(int angka){
        System.out.println("ini nilai integer: "+ angka);
    }
}
