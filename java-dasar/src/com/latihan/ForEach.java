package com.latihan;

import java.util.Arrays;

public class ForEach {
    public static void main(String[] args){
        int[] angka = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(angka));

        for (int i = 0; i < angka.length; i++){
            System.out.println("index ke-"+ i + " adalah : " + angka[i]);
        }

        System.out.println("=== ini for each ===");

        for (int i: angka) {
            System.out.println("index ke-"+ i + " adalah : " + i);
        }
    }
}
