package Restaurant;

public class KassiBhai extends Restaurant{

    public String name;
    public KassiBhai(String restaurantName, String location, String name){
        super(restaurantName, location);
        this.name = name;
    }

    @Override
    public void menuName() {

    }
}
