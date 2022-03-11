package programmer.generic.application;

import programmer.generic.MyData;

public class WildcardApp {
    public static void main(String[] args) {

        print(new MyData<>(100));
        print(new MyData<String>("Fajar"));
        print(new MyData<MultipleConstraintApp.Manager>(new MultipleConstraintApp.Manager()));

    }

    public static void print(MyData<?> myData){
        System.out.println(myData.getData());
    }
}
