package com.latihan;

public class LoopingBersarang {
    public static void main(String[] args){
        for (int i = 0; i < 5; i++){ // i kebawah
            for (int j = 0; j < 5; j++){ // j ke ke kanan
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for (int a = 0; a < 5; a++){ // i kebawah
            for (int b = 0; b < 5; b++){ // j ke ke kanan
                System.out.print("* ");
                if(a == b){
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for (int a = 0; a < 5; a++){ // i kebawah
            for (int b = 0; b < 5; b++){ // j ke ke kanan
                System.out.print("* ");
                if((a + b) == 4){
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for (int a = 0; a < 9; a++){ // i kebawah
            for (int b = 0; b < 9; b++){ // j ke ke kanan
                System.out.print("* ");
                if(a == b){
                    break;
                }else if(((a + b) == 8)){
                    break;
                }
            }
            System.out.print("\n");
        }
    }
}
