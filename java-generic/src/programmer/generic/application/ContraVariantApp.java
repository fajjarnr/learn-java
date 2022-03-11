package programmer.generic.application;

import programmer.generic.MyData;

public class ContraVariantApp {
    public static void main(String[] args) {
        MyData<Object> objectMyData = new MyData<>("Fajar");
        objectMyData.setData(1000);

        MyData<? super String> myData = objectMyData;

        process(objectMyData);

        System.out.println(objectMyData.getData());
    }

    /**
     * Contra Variant
     * dapat read & write
     */
    public static void process(MyData<? super String> myData){
        // agar aman gunakan Object
        Object value = myData.getData();
        System.out.println("Process parameter " + value);

        myData.setData("Fajar Nur Rohman");
    }
}
