package com.latihan;

public class BreakContinueReturn {
    public static void main(String[] args){
        int a = 0;

        while (true){
            a++;

            if(a == 10){
                break; // untuk keluar dari looping
            }else if(a == 5){
                continue; // memaksa mulai looping dari awal
            }else if(a == 7){
                return;
            }

            System.out.println("looping ke-" + a);
        }
    }
}
