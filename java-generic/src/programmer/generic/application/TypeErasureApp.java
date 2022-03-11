package programmer.generic.application;

import programmer.generic.MyData;

public class TypeErasureApp {
    public static void main(String[] args) {

        MyData myData = new MyData("Fajar");

        MyData<Integer> integerMyData = (MyData<Integer>) myData;
        Integer integer = integerMyData.getData();

    }
}
