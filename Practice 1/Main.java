
class Dog{
    String breed;
    void bark(){
        System.err.println("Woof!");
    }
}



public class Main {
    public static void main(String [] args) {
        //Create an object of the Dog class
        Dog myDog = new Dog();
        myDog.breed = "Golden Retriever";

        System.out.println("My dog is a " + myDog.breed);
        myDog.bark();

    }
}