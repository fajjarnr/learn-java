package programmer.generic.application;

import programmer.generic.MyData;

public class CovariantApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("Fajar");

        process(stringMyData);

        MyData<? extends Object> myData = stringMyData;
    }

    /**
     * covariant <? extends Object>
     * hanya boleh mengambil data
     * tidak dapat merubah
     */
    public static void process(MyData<? extends Object> myData){
        System.out.println(myData.getData());

        // myData.setData(1); tidak boleh, karena berbahaya
    }
}
