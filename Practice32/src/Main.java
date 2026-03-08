public class Main{
    public static void main(String [] args){
        GymManager gym = new GymManager();

        PremiumMember art = new PremiumMember("Art", true, true);
        BasicMember jash = new BasicMember("Jash", true);
        PremiumMember bro = new PremiumMember("Bro", false, false);
        BasicMember yow = new BasicMember("Yow", false);

        gym.registerMember(art);
        gym.registerMember(jash);
        gym.registerMember(bro);
        gym.registerMember(yow);
        gym.checkIn(art);
        gym.checkIn(jash);
        gym.checkIn(bro);
        gym.checkIn(yow);

        gym.printTotalRevenue();
    }
}
