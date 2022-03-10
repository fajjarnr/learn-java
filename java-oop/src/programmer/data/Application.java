package programmer.data;

public class Application {
    public static final int PROCCESSORS;

    static {
        System.out.println("Mengakses class application");
        PROCCESSORS = Runtime.getRuntime().availableProcessors();
    }
}
