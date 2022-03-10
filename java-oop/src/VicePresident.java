/**
 * inheritance = pewarisan class
 * menggunakan extends
 */

class VicePresident extends Manager {
    /**
     * super contructor
     * untuk memanggil contructor yg ada di parent
     */
    VicePresident(String name){
        super(name, null);
    }


    /**
     * method overriding
     * untuk medeklarasi ulang method di parent
     * dan method di parent tidak bisa digunakan kebali di child
     */
    void sayHello(String name){
        System.out.println("Hello, " + name + " My name is VP " + this.name);
    }
}
