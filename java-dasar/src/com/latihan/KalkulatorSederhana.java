package com.latihan;

import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args){
        Scanner userInput;
        float a, b, hasil;
        char operator;

        userInput = new Scanner(System.in);
        System.out.println("Program Kalkulator Sederhana");

        System.out.print("Masukan angka a: ");
        a = userInput.nextFloat();
        System.out.print("operator : ");
        operator = userInput.next().charAt(0);

        System.out.print("Masukan angka b: ");
        b = userInput.nextFloat();

        System.out.println("input user: " + a + " " + operator + " " + b);
        
        if(operator == '+'){
            hasil = a + b;
            System.out.println("hasil : "+ hasil);
        }else if(operator == '-'){
            hasil = a - b;
            System.out.println("hasil : "+ hasil);
        }else if(operator == '*'){
            hasil = a * b;
            System.out.println("hasil : "+ hasil);
        }else if(operator == '/'){
            if(b == 0){
                System.out.println("tak hingga");
            }else {
                hasil = a / b;
                System.out.println("hasil : "+ hasil);
            }
        }else{
            System.out.println("operator tidak ada");
        }
    }
}
