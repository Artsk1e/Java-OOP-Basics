

public class Audio extends Media{
    
    public Audio(String title){
        super(title);
    }

    @Override
    public void play(){
        System.out.println("Playing Audio: " +  title + " (Bass Boosted");
    }
}
