package programmer.data;

import programmer.annotation.Fancy;

@Fancy(name = "Car", tags = {"app", "java"})
public interface Car extends HasBrand, IsMaintenance{
    void drive();

    int getTier();

    /**
     * default
     * untuk maintain kontrak di interface
     * bisa membuat konkrit class di interface
     */
    default boolean isBig() {
        return false;
    }
}
