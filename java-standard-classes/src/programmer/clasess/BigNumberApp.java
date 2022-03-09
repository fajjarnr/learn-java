package programmer.clasess;

import java.math.BigInteger;

public class BigNumberApp {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("1000000000000");
        BigInteger b = new BigInteger("10000000000");
        BigInteger result = a.add(b);

        System.out.println(result);
    }
}
