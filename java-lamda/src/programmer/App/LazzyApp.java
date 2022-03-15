package programmer.App;

import java.util.function.Supplier;

public class LazzyApp {
    public static void main(String[] args) {
        testCore(60, () -> getName());
        System.out.println("---------");
        testCore(80, LazzyApp::getName);
    }

    public static void testCore(int score, Supplier<String> name){
        if(score > 70){
            System.out.println("Selamat " + name.get() + " anda lulus");
        }else{
            System.out.println("Coba lagi tahun depan");
        }
    }

    public static String getName(){
        System.out.println("method di panggil");
        return "Fajar";
    }
}
