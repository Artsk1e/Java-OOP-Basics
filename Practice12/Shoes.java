
public class Shoes extends Product{
    private int shoeSize;

    public Shoes(String name, double price, int shoeSize){
        super(name, price);
        this.shoeSize = shoeSize;
    }
    
    public void tieLaces(){
        System.out.println("You tied the laces of your size " + shoeSize + " "+ name);
    }
}
