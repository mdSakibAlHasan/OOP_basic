package Restaurant;

public abstract class Restaurant {
    public String restaurantName,location;

    public Restaurant(String restaurantName, String location){
        this.restaurantName = restaurantName;
        this.location = location;
    }

    public abstract void menuName();

    public void welcomeMessage(){
        System.out.println("Welcome to our restaurant");
    }

}
