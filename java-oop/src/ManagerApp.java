public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("Fajar");
        System.out.println(manager.name);
        manager.sayHello("Budi");

        var vicePresident = new VicePresident("Fahrur");
        System.out.println(vicePresident.name);
        vicePresident.sayHello("Andi");
    }
}
