package programmer.clasess;

import java.util.Random;

public class RandomApp {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int value = random.nextInt(1000);
            System.out.println(value);
        }
    }
}
