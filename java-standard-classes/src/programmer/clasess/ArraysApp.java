package programmer.clasess;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        int[] numbers = {
                1,24,546,241,657,343,63,2,4,6,3
        };

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.binarySearch(numbers, 7));
        System.out.println(Arrays.binarySearch(numbers, 657));

        int[] result  = Arrays.copyOf(numbers,5);
        System.out.println(Arrays.toString(result));

        int[] result2  = Arrays.copyOfRange(numbers,5, 10);
        System.out.println(Arrays.toString(result2));
    }
}
