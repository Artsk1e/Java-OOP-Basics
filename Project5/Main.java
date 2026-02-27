
import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {
        
        ArrayList<Track> playlist = new ArrayList<>();

        playlist.add(new StandardTrack("Saving My Love", 3.14));
        playlist.add(new StandardTrack("Aint Got You", 3.19));
        playlist.add(new PremiumTrack("Treasure", 3.20));
        playlist.add(new PremiumTrack("24K Magic", 4.13));

        System.out.println("=== Starting Playlist ===");

        for (Track p :  playlist){
            p.play();

            if (p instanceof Downloadable d) {
                d.download();
                }
            }
        }
    }

