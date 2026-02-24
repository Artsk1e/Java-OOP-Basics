

public class MainMedia {
    public static void main(String[] args) {
        //Create a shelf that holds to Media uniforms
        Media[] playlist = new Media[2];

        //Put a video and an audio on the shelf
        //This is allowed since video "Is-A" Media
        playlist[0] = new Audio("Baby");
        playlist[1] = new Video("Avengers");

        for (Media m : playlist){
            m.play();
        }


    }
}
