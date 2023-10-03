package Restaurant;

public class SultanDines extends Restaurant{
    public SultanDines() {
        super("Sultan Dines", " Puran Dhaka");
    }

    @Override
    public void menuName() {
        System.out.println("1. kacci \n 2. Chop.....");
    }

//    @Override
//    public void welcomeMessage() {
//        System.out.println("Wellcome to sultanDines");
//    }

    public static void main(String[] args) {
        SultanDines sultanDines = new SultanDines();
        sultanDines.welcomeMessage();
        sultanDines.menuName();
    }
}
