
class Dog{
    String breed;
    int age;

    Dog(String breed, int age){
        this.breed = breed;
        this.age = age;
    }

    void displayInfo(){
        System.out.println("Breed: " + this.breed + ", Age" + this.age);
    }
    }




public class Main {
    public static void main(String [] args) {
        //One line to create and initialize
        Dog myDog = new Dog("Husky", 3);
        myDog.displayInfo();


        Cat cat1 = new Cat("Bella", "Black", 14);
        Cat cat2 = new Cat("Sasha", "White", 9);

        cat1.meow();
        cat2.meow();
    }
}