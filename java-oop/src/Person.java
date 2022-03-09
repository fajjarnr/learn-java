class Person {
    // field item di dalam class
    String name;
    String address;
    // final tidak dapat diubah
    final String country = "Indonesia";

    // constructor
    // nama contructor harus sama dengan class
    // this untuk mengatasi variable shadowing
    Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    // constructor overloading 2
    // variable shadowing = variable paramater yang sama tidak akan dibaca
    Person(String paramName){
        // memanggil contructor 1
        this(paramName, null);
    }

    // constructor overloading 3
    Person(){
        // memanggil contructor 2
        this(null);
    }

    // method di dalam class
    void sayHello(String name){
        System.out.println("Hello, " + name + " My name is " + this.name);
    }
}