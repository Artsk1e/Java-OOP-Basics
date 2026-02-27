

public class PremiumTrack extends Track implements Downloadable{
    
    public PremiumTrack(String title, double duration){
        super(title, duration);
    }

    @Override
    public void play(){
        System.out.println("Playing " + title + " in HD.");
    }

    @Override
    public void download(){
        System.out.println("Downloading " + title + " to your phone.");
    }
}
