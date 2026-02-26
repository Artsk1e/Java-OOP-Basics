

public class Main {
    public static void main(String[] args) {
        Attacker[] atk = new Attacker[2];
        Healer[] heal = new  Healer[2];

        atk[0] = new Soldier("Art", 10);
        atk[1] = new Paladin("James", 10);
        heal[0] =  new Medic("Ron", 10);
        heal[1] = new Paladin("James", 10);

        for(Attacker a : atk){
            a.attack();
        }

        for(Healer h : heal){
            h.heal();
        }
    }
}
