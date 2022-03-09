public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("Fajar", "Pemalang");
        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Budi");

        Person person2 = new Person("Fahrur");
        System.out.println(person2.name);

        Person person3 = new Person();
        // tanpa constractor
        person3.name = "Budi";
        person3.address = "Pemalang";

        System.out.println(person3.name);
        System.out.println(person3.address);
    }
}
