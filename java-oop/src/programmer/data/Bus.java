package programmer.data;

public class Bus implements Car {
    public void drive() {
        System.out.println("bus drive");
    }

    public int getTier() {
        return 8;
    }

    public String getBrand() {
        return "HINO";
    }

    public boolean isMaintenance() {
        return false;
    }

    public boolean isBig() {
        return true;
    }
}
