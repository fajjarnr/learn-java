package com.latihan;

public class OperatorUnary {
    public static void main(String[] args){
//        unary = operasi yang dilakukan pada satu variable
        int angka = 1;
        System.out.printf("unary '+', %d menjadi %d \n", angka, +angka);
        System.out.printf("unary '-', %d menjadi %d \n", angka, -angka);

        int angka2 = 10;
        angka2++;
        System.out.println(angka2);

        int angka3 = 10;
        angka3--;
        System.out.println(angka3);
    }
}
