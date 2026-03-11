//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
	public static void main(String [] args){
        Library library = new Library();

        PaperBook java = new PaperBook("JAVA BOOK", 1, 200);
        DVD avengers = new DVD("Avengers Endgame", 2, 180);
        Ebook atomicHabits = new Ebook("Atomic Habits", 3, 200);

        library.addMedia(java);
        library.addMedia(avengers);
        library.addMedia(atomicHabits);

        library.performAction(java);
        library.performAction(avengers);
        library.performAction(atomicHabits);

        library.showHistory();
    }
}
