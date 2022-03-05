package com.latihan;

public class KonversiTipeData {
    public static void main(String[] args){
        int nilaiInt = 450;
        System.out.println(nilaiInt);

//        memperbesar rentang ke tipe data yang lebih besar
        long nilaiLong = nilaiInt;
        System.out.println(nilaiLong);

//        memperkecil rentang ke tipe data yang lebih kecil
        byte nilaiByte = (byte) nilaiInt;
        System.out.println(nilaiByte);
        System.out.println("ini nilai max byte " + Byte.MAX_VALUE);
        System.out.println("ini nilai min byte " + Byte.MIN_VALUE);

        float a = 10;
        int b = 4;
        float c = a / b;
        System.out.printf("%f / %d = %f\n",a,b,c);

        int x = 10;
        int y = 4;
        float z = (float) x / y;
        System.out.printf("%d / %d = %f \n",x,y,z);
    }
}
