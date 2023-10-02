package Restaurant;

public class SuperShop extends Restaurant implements Shop{
    public SuperShop(String restaurantName, String location) {
        super(restaurantName, location);
    }

    @Override
    public void menuName() {
        System.out.println("1. kacci \n 2. Chop.....");
    }

    @Override
    public double priceCalculate(double price, int unite) {
        return 0;
    }

    @Override
    public boolean isAvaiable(String product) {
        return false;
    }
}
