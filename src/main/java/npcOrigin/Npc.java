package npcOrigin;

public class Npc {
    private String name;
    private Origin origin;

    public Npc(String name, Origin origin){
        this.name = name;
        this.origin = origin;
    }

    public String toString(){
        return "Name: " + name +
                " Origin Name: " + origin.getName() +
                " Origin Feature: " + origin.getFeature();

    }
}
