import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Attacker[] atk = new Attacker[2];
        ArrayList<Healer> medics = new ArrayList<>();

        atk[0] = new Soldier("Art", 10);
        atk[1] = new Paladin("James", 10);

        medics.add(new Medic("Love", 10));
        medics.add(new Paladin("James", 10));
        for(Attacker a : atk){
            a.attack();
        }

        for(Healer h : medics){
            h.heal();
        }
    }
}
