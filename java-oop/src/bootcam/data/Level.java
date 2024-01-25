package bootcam.data;

import bootcam.annotation.Fancy;

@Fancy(name = "Level", tags = {"Application", "Java"})
public enum Level {
    STANDARD("Standard Level"),
    PREMIUM("Premium Level"),
    VIP("VIP Levelk");

    private String description;

    Level(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}
