
public class Video extends Media {
    
    public Video(String title){
        super(title);
    }

    @Override
    public void play(){
        System.out.println("Playing Video: " + title + " Showing 4K visuals)");
    }
}
