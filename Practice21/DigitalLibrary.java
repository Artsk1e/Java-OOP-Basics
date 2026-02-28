

public class DigitalLibrary {
    public static void main(String[] args) {
        String[] books = {"Java Basics", "OOP Mastery", "DSA Quest"};

        System.out.println("Library Search.");
        try {
            System.out.println(books[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ERROR!");
        } finally {
            System.out.println("Library Search Finished.");
        }


    }
}
