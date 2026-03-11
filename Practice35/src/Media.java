public abstract class Media {
    private String mediaName;
    private int id;
    private int health = 100;

    public Media(String mediaName, int id){
        this.mediaName = mediaName;
        this.id = id;
    }

    public int getHealth(){
        return health;
    }

    public int getId(){
        return id;
    }

    public String getMediaName(){
        return mediaName;
    }

    public abstract void displayInfo();

    public void reduceHealth(int amount){
        this.health -= amount;
        this.health = Math.max(this.health,0);
        System.out.println(mediaName + " health is now: " + health);
    }
}
