package com.latihan;

public class FungsiVoid {
    public static void main(String[] args){
        // void = hampa / kosong
        System.out.println(simple());

        fungsiVoid("apapun");
        selamatPagi("emak");
        selamatPagi("bapak");
    }

    // fungsi atau method tanpa kembalian
    private static void fungsiVoid(String input){
        System.out.println(input);
    }

    private static void selamatPagi(String nama){
        System.out.println("Selamat pagi " + nama);
    }

    // fungsi atau method dengan kembalian
    private static float simple(){
        return 10.0f;
    }
}
