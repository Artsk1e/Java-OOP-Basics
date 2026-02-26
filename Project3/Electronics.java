package Project3;

public class Electronics extends Item implements Fragile, Insured{
    
    public Electronics(String name, double baseWeight){
        super(name, baseWeight);
    }

    @Override
    public void getPackingCost(){
        
    }
}
