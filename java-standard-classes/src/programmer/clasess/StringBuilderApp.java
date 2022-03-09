package programmer.clasess;

public class StringBuilderApp {
    public static void main(String[] args) {
        /**
         * String builder
         * untuk mamanipulasi string sehingga dapat menghemat memory
         */
        StringBuilder builder = new StringBuilder();
        builder.append("Fajar");
        builder.append(" ");
        builder.append("Nur");
        builder.append(" ");
        builder.append("Rohman");

        String name = builder.toString();
        System.out.println(name);
    }
}
