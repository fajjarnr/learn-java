package programmer.App;

import programmer.util.StringUtil;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceApp {
    public static void main(String[] args) {
        // Predicate<String> predicate = value -> StringUtil.isLowerCase(value);
        Predicate<String> predicate = StringUtil::isLowerCase;

        System.out.println(predicate.test("fajar"));
        System.out.println(predicate.test("Fajar"));

        // method reference di parameter
        Function<String, String> function = String::toUpperCase;

        System.out.println(function.apply("fajar"));
    }

    // bukan static
    public void run(){
        MethodReferenceApp app = new MethodReferenceApp();
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return MethodReferenceApp.this.isLowerCase(s);
            }
        };

        Predicate<String> predicate1 = MethodReferenceApp.this::isLowerCase;

        // method object sendiri
        Predicate<String> predicate2 = this::isLowerCase;

        // method object orang lain
        Predicate<String> predicate3 = app::isLowerCase;


        System.out.println(predicate.test("fajar"));
        System.out.println(predicate.test("Fajar"));
    }

    public boolean isLowerCase(String value){
        for (var c: value.toCharArray()) {
            if(!Character.isLowerCase(c)){
                return false;
            }
        }
        return true;
    }
}
