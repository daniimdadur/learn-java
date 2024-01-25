package bootcam.data;

import bootcam.annotation.Fancy;

@Fancy(name = "Car", tags = {"Application", "Java"})
public interface Car extends HasBrand,IsMaintenance{
    void drive();
    int getTier();

    default boolean isBig(){
        return false;
    }
}
