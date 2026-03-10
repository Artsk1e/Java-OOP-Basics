public abstract class Hero {
    private String name;

    public Hero(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }


    public abstract void attack(Damageable target);
}
