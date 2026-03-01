

public abstract class Vehicle implements Drivable{
    private String model;
    private int health;

    public Vehicle(String model, int health){
        this.model = model;
        this.health = health;
    }

    public String getModel(){
        return model;
    }

    public int getHealth(){
        return health;
    }

    public void setHealth(int health){
        if (health >= 100 && health <= 0){
            this.health = health;
        } else {
            System.out.println("Invalid Health Value");
        }
    } 

    public abstract void displayInfo();
    }

