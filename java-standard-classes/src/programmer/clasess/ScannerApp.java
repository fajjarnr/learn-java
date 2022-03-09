package programmer.clasess;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Name : ");
        String name = input.nextLine();

        System.out.print("Age : ");
        Integer age = input.nextInt();

        System.out.println("Hello, My name is " + name + " My age is " + age);
    }
}
