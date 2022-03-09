/**
 * polymorphism = banyak bentuk
 * perubahan bentuk dari satu bentuk object ke bentuk object lain
 * erat dengan inheritance (pewarisan)
 */
public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Anto");
        employee.sayHello("Andi");

        employee = new Manager("Anto");
        employee.sayHello("Budi");

        employee = new VicePresident("Anto");
        employee.sayHello("Supri");

        sayHello(new Employee("Fajar"));
        sayHello(new Manager("Fajar"));
        sayHello(new VicePresident("Fahrur"));
    }

    static void sayHello(Employee employee){
        /**
         * Type Check and Cast
         * pengecekan tipe data menggunakan = instanceof hasil boolean true / false
         */
        if(employee instanceof VicePresident){
            // konversi
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP , " + employee.name);
        }else if(employee instanceof Manager){
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager, "+ employee.name);
        }else {
            System.out.println("Hello employee, " + employee.name);
        }
    }
}
