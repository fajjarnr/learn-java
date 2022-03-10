package programmer.data;

public class Avanza implements Car{
    public void drive() {
        System.out.println("avanza drive");
    }

    public int getTier() {
        return 4;
    }

    public String getBrand() {
        return "Toyota";
    }

    public boolean isMaintenance() {
        return false;
    }

    public boolean isBig() {
        return false;
    }
}
