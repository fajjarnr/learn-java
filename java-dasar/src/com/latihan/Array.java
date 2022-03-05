package com.latihan;

import java.util.Arrays;

public class Array {
    public static void main(String[] args){
        int[] angka = {1,2,3,4,5};
        String[] buah = {"apple", "jeruk", "mangga"};

        System.out.println(angka[4]);
        System.out.println(buah[0]);

        float[] arrayFloat = new float[5];
        arrayFloat[4] = 34.5f;
        System.out.println(arrayFloat[4]);

        System.out.println(Arrays.toString(angka));
        System.out.println(Arrays.toString(buah));
        System.out.println(Arrays.toString(arrayFloat));
    }
}
