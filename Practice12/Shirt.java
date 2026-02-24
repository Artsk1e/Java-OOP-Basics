public class Shirt extends Product {
    private String size;

    public Shirt(String name, double price, String size){
        super(name, price);
        this.size = size;
    }

    public void wear(){
        System.out.println("Wearing " + size + " " + name);
    }
}
