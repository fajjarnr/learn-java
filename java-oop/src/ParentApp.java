import java.sql.SQLOutput;

public class ParentApp {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "Fajar";
        System.out.println(child.name);
        child.doIt();

        Parent parent = (Parent) child;
        parent.name = "Dar";
        System.out.println(parent.name);
        parent.doIt();
    }
}
