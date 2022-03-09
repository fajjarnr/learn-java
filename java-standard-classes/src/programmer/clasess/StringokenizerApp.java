package programmer.clasess;

import java.util.StringTokenizer;

public class StringokenizerApp {
    public static void main(String[] args) {
        String value = "Fajar Nur Rohman";
        StringTokenizer tokenizer = new StringTokenizer(value, " ");

        while (tokenizer.hasMoreTokens()){
            String result = tokenizer.nextToken();
            System.out.println(result);
        }
    }
}
