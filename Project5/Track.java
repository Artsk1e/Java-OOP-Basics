

public abstract class Track {
    protected String title;
    protected double duration;

    public Track(String title, double duration){
        this.title = title;
        this.duration = duration;
    }

    public abstract void play();
}
