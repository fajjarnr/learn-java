package programmer.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {
    private String name;

    private List<String> hobbies;

    public Person(String name) {
        this.name = name;
        this.hobbies = new ArrayList<>();
    }

    public void addHobby(String hobby){
        hobbies.add(hobby);
    }

    public List<String> getHobbies(){
        // agar tidak dapat di ubah
        return Collections.unmodifiableList(hobbies);
    }

    public String getName() {
        return name;
    }
}
