

public abstract class Member {
    protected String name;
    protected String membershipType;

    public Member(String name, String membershipType){
        this.name = name;
        this.membershipType = membershipType;
    }

    public abstract double calculateMonthlyBill();
}
