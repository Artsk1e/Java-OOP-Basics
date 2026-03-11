import java.util.ArrayList;

public class Library {
    private ArrayList<Media> collection = new ArrayList<>();
    private ArrayList<String> activityLog = new ArrayList<>();

    public void addMedia(Media m) {
        collection.add(m);
        System.out.println("Added to collection: " + m.getMediaName());
    }

    public void performAction(Media m) {
        if (m instanceof Physical){
            ((Physical) m).borrowItem();
            activityLog.add("Physical transaction: " + m.getMediaName());
        } else if (m instanceof Electronic){
            ((Electronic) m).download();
            activityLog.add("Digital download: " + m.getMediaName());
        }
    }

    public void showHistory(){
        System.out.println("--- Library Activity Log ---");
        for (String log : activityLog){
            System.out.println(log);
        }
    }
}
