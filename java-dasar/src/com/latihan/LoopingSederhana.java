package com.latihan;

import java.util.Scanner;

public class LoopingSederhana {
    public static void main(String[] args){
        int nilaiAwal, nilaiAkhir, total;

        Scanner userInput = new Scanner(System.in);

        System.out.print("masukan nilai awal: ");
        nilaiAwal = userInput.nextInt();

        System.out.print("masukan nilai akhir: ");
        nilaiAkhir = userInput.nextInt();

        total = 0;

        while (nilaiAwal <= nilaiAkhir){
            total = total + nilaiAwal;
            System.out.println("ditambah "+ nilaiAwal + " menjadi " + total);
            nilaiAwal++;
        }
    }
}
