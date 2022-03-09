package programmer.data;

import programmer.annotation.Fancy;

@Fancy(name = "Level", tags = {"app", "java"})
public enum Level {
    STANDARD("Standard Level"),
    PREMIUM("Premium Level"),
    VIP("VIP Level");

    private String description;

    Level(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}
