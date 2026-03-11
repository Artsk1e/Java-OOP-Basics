public class PaperBook extends Media implements Physical{
    private final int pageCount;

    public PaperBook(String mediaName, int id, int pageCount){
        super(mediaName, id);
        this.pageCount = pageCount;
    }

    @Override
    public void borrowItem(){
        if (getHealth() > 0){
            System.out.println(getMediaName() + " borrowed.");
        } else {
            System.out.println("Can't borrow! too damage.");
        }
    }

    @Override
    public void returnItem(){
        System.out.println(getMediaName() + " is returned.");
    }

    @Override
    public void takeDamage(int amount) {
        System.out.println("The pages are ripping!");
        reduceHealth(50);
    }

    @Override
    public void displayInfo() {
        System.out.println("Item Name: " + getMediaName() + " id: " + getId());
    }
}
