package programmer.generic.application;

import programmer.generic.MyData;

public class MyDataApp {
    public static void main(String[] args) {
        MyData<String> data = new MyData<String>("Fajar");
        MyData<Integer> intData = new MyData<Integer>(22);

        String dataValue = data.getData();
        Integer integerValue = intData.getData();

        System.out.println(dataValue);
        System.out.println(integerValue);
    }
}
