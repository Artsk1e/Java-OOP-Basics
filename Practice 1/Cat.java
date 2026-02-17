class Cat {
    String name;
    String color;
    int age;

    //Constructor (The Order Form)
    Cat(String name, String color, int age){
        this.name = name;  //"Put the name input into the Cat's name box"
        this.color = color; // Put the color input into the Cat's color box"
        this.age = age;

    }

    //The behavior (the Action)
    void meow(){
        System.out.println(this.name + " says: MEOW! I am " + this.color);
        System.out.println("My age is: " + this.age);


    }
}

