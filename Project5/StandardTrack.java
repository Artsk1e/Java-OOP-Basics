

public class StandardTrack extends  Track{

    public StandardTrack(String title, double duration){
        super(title, duration);
    }

    @Override
    public void play(){
        System.out.println("Playing " + title + " with Ads...");
    }
    
}
