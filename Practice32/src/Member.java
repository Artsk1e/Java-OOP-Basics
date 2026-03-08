public abstract class Member {
    private String name;
    private boolean hasPaidFree;

    public Member(String name, boolean hasPaidFree){
        this.name = name;
        this.hasPaidFree = hasPaidFree;
    }

    public String getName(){
        return name;
    }

    public boolean isHasPaidFree(){
        return hasPaidFree;
    }

    public abstract double getMonthlyCost();
}
