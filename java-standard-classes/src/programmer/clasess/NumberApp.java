package programmer.clasess;

public class NumberApp {
    public static void main(String[] args) {
        Integer intValue = 10;

        Long longValue = intValue.longValue();
        Double doubleValue = intValue.doubleValue();
        Short shortValue = doubleValue.shortValue();

        System.out.println(longValue);

        String contoh = "10000";
        Integer contohInt = Integer.valueOf(contoh);

        System.out.println(contohInt);
    }
}
