package programmer.application;

import programmer.data.HelloWorld;

public class HelloWorldApp {
    public static void main(String[] args) {
        /**
         * Anonymous Class
         * mendeklarasi class dan instansi secara langsung
         */
        HelloWorld english = new HelloWorld() {
            public void sayHello() {
                System.out.println("Hello");
            }

            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };

        HelloWorld indonesian = new HelloWorld() {
            public void sayHello() {
                System.out.println("Hello");
            }

            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };

        english.sayHello();
        english.sayHello("Fajar");
        indonesian.sayHello();
        indonesian.sayHello("Fahrur");
    }
}
