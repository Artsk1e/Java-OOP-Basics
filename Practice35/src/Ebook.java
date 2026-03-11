public class Ebook extends Media implements Electronic{
    private int fileSize;

    public Ebook(String mediaName, int id, int fileSize){
        super(mediaName, id);
        this.fileSize = fileSize;
    }

    public void download(){
        System.out.println("Downloaded " + getMediaName() + " with a file size of " + fileSize + "MB.");
    }

    @Override
    public void displayInfo(){
        System.out.println("Item name: " + getMediaName() + " and Id: " + getId());
    }
}
