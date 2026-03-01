import java.util.ArrayList;

public class LabManager {
    public static void main(String[] args) {
        ArrayList<Specimen> creatures = new ArrayList<>();

        creatures.add(new AerialCreature("Eagle", 90, false, 100));
        creatures.add(new AquaticCreature("Dolphin", 20, true, 20));

        for (Specimen s : creatures){
            s.performAction();
            if (s instanceof AquaticCreature a){
                a.reactToSound("Sonar");
                a.reactToLight(90);
        } else if (s instanceof AerialCreature b){
            b.reactToSound("Whistle");
            b.reactToLight(5);
        }

        
    }
}}
