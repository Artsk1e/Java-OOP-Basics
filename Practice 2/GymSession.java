class Workout {
    String exerciseName;
    int sets;

    // TODO: create first a Constructor that takes names and sets
    Workout(String exerciseName, int sets){
        this.exerciseName = exerciseName;
        this.sets = sets;
    }

    // Create the method
    void performSet(){
        this.sets = this.sets - 1; // Decrease sets left
        System.out.println("Finished 1 set of " + this.exerciseName);
        System.err.println("Sets remaining: " + this.sets);
    }
}

public class GymSession
 {
    public static void main(String[] args){
        //Initialize your workout (Exercise name, Sets)
        Workout myPushDay = new Workout("Bench Press", 4);

        myPushDay.performSet();
        myPushDay.performSet();

        Workout myLegDay = new Workout("Squats", 3);
        myLegDay.performSet();


    }
}
