package dev.moonrise.module;

public enum Category {

    COMBAT("Combat"),
    MOVEMENT("Movement"),
    PLAYER("Player"),
    RENDER("Render"),
    MISC("Misc"),
    HUD("Hud");

    public String mname;
    public int i;
    Category(String mname){
        this.mname = mname;
    }
}